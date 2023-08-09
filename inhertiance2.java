Object oriendted programming 
lecture -2
Properties of object oriendted programming 
The program is divided into object and chunks so that there is modularity and abstraction .
There are mainly 4 main properties of oops ->
1) inheritance 
2) polymorphism
3) abstraction
4) encapulstion
 
Inheritance
parents -> child ->son -> and so on . 
The value  / attributes pased by the parents can be used by the son . So the parent"extend" the son trait by givintg him/ her some of their traits  . 

In oops the child which provide the traits to the son is called the "base class and the class which inherits the traits are the child class  .
Child class has all the ascess to the properties of all the parent class traits  . 

We say the child class inhertis the properties from the base class  . 

A child class used the "extend" keyword to use the properties of the parent . 

After  making the object of the child class we can ascess the parent attributes using the
"." keyword  .
for the fixing of the keyword in the of the child class which are the attrribues of the parent class we use the super(int l , int w , int h , upto x,y,z) which mean to say that please class the parent class constructor for setting the values of child class.  
 once a parent class has defined a keyword as priavte the that cannot be ascessed as they  does not have ascess to the outside class . 

if the object is created of parent class the child attribues cannot be used . 
A child refrance vartiable and a parent initialisation is not allowed .  

Super() keyword  -> the super keyword always point to teh pervious parent class . 
The parent class has a objecvt class and it pout to  the object class .  
The parent class pouint and has the attributes of the obejct class . 
For the ascess of the super class we can use the super.attribute name to point to the properties of the keyword  ./ 
Super class is bascially the parent class  . 

Types of inheritance ->
1)Single inheritance -> in this one class extend the other class . 
example is box  -> vboxwreight  ;
2) multi level inheritance - > the derived class become parent of anathor class  . example for this is box  , boxweight , box price .  while crerating a super there must a constructor that shoudl take the required elements from the other class  . 
The super(element name) this will set the argumentof child class according to the suepr claas . 
In multi level the pointer goes up and up and up . 

3) Multuiple inheritance -> this is when one class is extending more than one classes . 
c extends a and then c extends b so there is a condlict of issues to which object to ascees while we are making a refrance  . 
This thing is not in java  , this is only in cpp  .
However this can be done by interfaces that tell what the class does and nopthing about how it does the same .  

4) herierichal inheritance  > one class is inherited by the other class.

One class is iherited by many classes .  b,c,d inherts the characters from a  .
make multiple class with extend keyword  . 

5) Hybrid inhertiance - > this is a combination of single and multiple inheritance . this is again not a part of java  . use the interfaces and then we can have a ascess to the same  . 




