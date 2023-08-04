Gui programming (java)
Introduction to swing 
To use gui in java we have to use some packages called as the "swing packages" .
Before th era of swing there was something called awt and now a days somehting called 
javaFx is used  .
awt used-> java 1 
swing used -> java 1.1 
javaFx used -> java 11 
AWT(abstract windiow toolkit) .
There is a inbuilt class in java callled Jframe .
Jframe belongs to the swing package .
for using the jframe from the swing first a import statement named  ->
import javax.swing.jframe is used .
To make something visible we can use make.visible or objename.setvisibile(TRUE/FALSE).
to see the gui windwo using obj.setSize(width , height) can be used . both the widht and the height are in pixels .
To show something or if we wish to print somehting in the gui window we always use the JLABEL  .
For using the jlabel we have to use import java.swing.jlabel .
inside the jlabel constructor we have to privde the text / the string value.
the lable has to posted on the canvas . / on the frame .
simple add is used to add the label to the frame .
Labels are used to add text to the gui's .
for displaying n text we have to make n label in total.

Jframe follows the principle of cardlayout  whichh means when we more label is defined on the top of the other there is a overwrite done to the previous label .
Card layout always do the overriding . 

cardlayout is the default method . 
for this we have to set the method by using the setLayout(_) command. 
in the setlayout there are several option avaible such as ->  ;
1) grid layout .
2) floor layout .
3) NULL layout .
for using any of the above use first create the object of that layout and passthat to the setLayout format this will direcly help in the setting of the layout .

When the gui is visible to the user there is a running code even after we close the window using the red cross for this we have to add some command tio make the things work prooperly .
Syntax -> setmethodcloseoperation(jframe.exiton close) .
by default the value of exit on  close is numeric 3 or simply 3 .
//IT IS IMPORTANT TO WRITE THE 4 ABOVE STATEMENT FOR EACH AND EVERY CODE. //
// THE MAIN PART OF THE CODE IN THE GUI IS ALWAYS EXTENDED BY THE JFRAME. //
for taking the inputs in java we have to use somthing called jtextfield .
we are supposed ot make the object of the same .
label is used to take the output . for the same. 
 to make a button in java that will run the code there is something called "jbutton" that is used to run the java c9ode in the gui interface .
Make a object for the button using jbutton in java  .
in the textfeild object we also have to deifne the size for the number of input bits .
4 for int , long int etx. 
the button for displaying the output in swing we have to make somthing called a listiner so that the output can be carried eaily into the output .
example -> syntax -> addactionlistner() .// This is not a class this is a interface .

An object of actionlistner() interface is needed by the actionlistner() . This interface can be implemented by 2 ways ->
1-> either none class specially made can be use to run the same .
2-> inside the defind fgunction  can be use to run the interface  .

the class inside the action listner is the  name is actionevent .



if we pass this.keyowrd then this become the object of both the actionlistenr and the operation that has to be done .
