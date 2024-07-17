import yaml
errors = []
def load_yaml_file(file_path):
    with open(file_path, 'r') as f:
        data = yaml.safe_load(f)
    return data

def check_bit_ranges(opcodes):
    bit_ranges = {}

    for opcode, details in opcodes.items():
        bit_start = details.get('bit_start', None)
        bit_end = details.get('bit_end', None)

        if bit_start is None or bit_end is None:
            errors.append(f"Opcode {opcode} is missing 'bit_start' or 'bit_end'.")
            continue

        if bit_start >= bit_end:
            errors.append(f"Opcode {opcode} has invalid bit range: bit_start >= bit_end.")
            continue
        for existing_opcode, existing_range in bit_ranges.items():
            if (bit_start < existing_range[1] and bit_end > existing_range[0]):
                errors.append(f"Opcode {opcode} overlaps with existing opcode {existing_opcode} in bit range.")
                break

        bit_ranges[opcode] = (bit_start, bit_end)

    return errors

def check_bit_values(opcodes):
    errors = []

    for opcode, details in opcodes.items():
        bit_start = details.get('bit_start', None)
        bit_end = details.get('bit_end', None)
        value = details.get('value', None)

        if bit_start is None or bit_end is None or value is None:
            continue

        # Calculate width of the field
        width = bit_end - bit_start + 1
        max_value = (1 << width) - 1

        if value > max_value:
            errors.append(f"Opcode {opcode} has value {value} which exceeds the width of its bit range ({width} bits).")

    return errors

def check_argument_mappings(opcodes, argument_lookup):
    errors = []
    for opcode, details in opcodes.items():
        arguments = details.get('arguments', [])

        for arg in arguments:
            if arg not in argument_lookup:
                errors.append(f"Opcode {opcode} references argument '{arg}' which is not found in the argument lookup table.")

    return errors

def validate_opcode_definitions(yaml_file):
    opcodes = load_yaml_file(yaml_file)
    overlap_errors = check_bit_ranges(opcodes)
    value_errors = check_bit_values(opcodes)
    argument_lookup = opcodes.get('argument_lookup', {})
    argument_errors = check_argument_mappings(opcodes, argument_lookup)
    all_errors = overlap_errors + value_errors + argument_errors

    if len(all_errors) > 0:
        for error in all_errors:
            print(error)
    else:
        print("Opcode definitions are consistent and valid.")

yaml_file_path = r"C:\Users\rohan\OneDrive\Desktop\Codes\input.yaml"
validate_opcode_definitions(yaml_file_path)
print("error " , errors)
