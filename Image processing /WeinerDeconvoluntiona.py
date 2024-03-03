import cv2
import numpy as np

# Load the blurred image
blurred_image = cv2.imread('blurred_image.jpg', 0)  # Read the image in grayscale

# Define the Wiener deconvolution kernel size
kernel_size = (5, 5)

# Apply Wiener deconvolution
deblurred_image, estimated_kernel = cv2.deconvolutionBiWLS(blurred_image, kernel_size)

# Display or save the deblurred image
cv2.imshow('Deblurred Image', deblurred_image)
cv2.waitKey(0)
cv2.destroyAllWindows()
