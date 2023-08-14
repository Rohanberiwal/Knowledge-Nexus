polmorphism in contuniation 
poly ->many 
morphism -> way to represent 
A task may be performed in different ways any language that does not support polymorphismn is called non object oriented . 
Those are called as the object pases langauge . 

polymorphism alawys occues during the inheritance 
this is multi - inherniantce ifas there are many ways to print the same function or to ascess the same function  .

Act or representawtion of same thing in the multiple ways is called as the polymorhpism  .
for example -> a class called as shapes . 
CODE STARTS -->
import java.util.*;
class Main 
{
    public static class Shapes 
    {
        String name  ;
       static  void area()
        {
            System.out.print(" the area is ") ;
        } 
    }
    public static class square extends Shapes 
    {
        static void area()
        {
            System.out.print("the area is side*side") ;

        }
    }
    public static class circle extends Shapes 
    {
         static void area()
         {
            System.out.print("the area is pir2") ;
         }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        Shapes snm = new Shapes() ;
        snm.area() ;
        circle c  = new circle() ;
        square s = new square()  ;
        c.area() ;
        s.area() ;


    }
}
CODE ENDS -->
Techinical details of the polymorphism 
making multiple conmstructor in the class is also called as the polymorphism , since the construcotr class has multiple way to represent and take the inputs . 

Types of polymorphism 
1) complie time polymorphism / static polymorhopism
this is achieved via method overloading  , can be providing operator overlaofin not providee in java  .

same name of method but different types , and different type of odering and differetn return values , example the system.out.println function that can return the float , int , char , double , bytes  , etc . 


This is called as the complie time polymorphism , mehtod overloading  .
This is called so because java determines that which type of the constructor has to be executed at the compile time  


for example ->
int sum (a,b)
float sum(a,b)
double sum(a,b)

complie time polymorhpism method overloading / static polymorphism 


import java.util.*;
class Main 
{
    public static class Numbers
    {
        static int add(int a , int b)
        {
            return a+b;
        }
        static float add(float a , float b)
        {
            return a+b ;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Numbers num1 = new Numbers() ;
        num1.add(2,4) ;
	nums1.add(2.87.9.45) ;
        
    }
}
in java abnd during the polymorhpism auto - casting is somehting that always works . 

2nd type of polymorhpism ->
Runtime polymorphism  / dynamic polymorhpism 
achieved by method overriding 
if the parent has a method and the child has rthe method everything is same just the body strucutrer is different .
The way to cherck if the method is overrided can be checked by the @override. 

for exmapel in the shapes class ther is area() which overirde the parent class shapes's overide . 


the complie time == ruintime is the equation that is being followed . 
the complie time paret has all the object that are asceccable to the fcomplie time class .
example 
shapes circle  = new cirlc()
all the attributes for the shapes are ascessible adn can be used by the object circle that belongs to the constructor class circle() .


for example code starts here 
import java.util.*;
class Main 
{
    public static class Shapes 
    {
        String name  ;
       static  void area()
        {
            System.out.print(" the area is ") ;
        } 
    }
    public static class square extends Shapes 
    {
        static void area()
        {
            System.out.print("the area is side*side") ;

        }
    }
    public static class circle extends Shapes 
    {
         static void area()
         {
            System.out.print("the area is pir2") ;
         }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        Shapes snm = new Shapes() ;
        Shapes cir = new circle() ;
        cir.area() ;


    }
}
cir is the object of the child class named circle  .
ascessing the variables done at the shapes . 


method overriding is used when the refracne variable is of the super class and the method called depends on theh subclass or on the object class . 


STANDARD SYNTAX  > how does the overrding happens > >

> PARENT OBJECT = NEW CHILD() // UP - CASTING 
child() here causes the upcasting . 
Here ths object ios of the child class but the ascess variavble are of the parent class . 

WORKING OF JAVA 
> Dynmaic method dispatch (dmd)
> this is bascially a method where call to the method is resolveda at the runtime rather than the compile time .
Druing the method is runnign then java determines which method to run  .

Here java also determines which method of the class to call based on the type of the obejct to be called and the parameter being passed .

This is made at the runtime hence the method overriding is Always checked at the runtime also called the dynamci polymorhpism . 

The detection of the type of the paramter are being checked by the java at the runtime , even the oveririding  .

object class is the father class and veery class extends this class  .

A standard example of the runtime / dynamic polymorphsim is the toString mehtod that has same working , attribues but the structure is differernt .
tostring runs at the runtime . 


final and static keyword in the polymorhpismn 
final keyword is use to prevent the overriding . 
A final method can never be overidden . 
final keyowrd makes the function , attribute increase the computation hence the complier when is free give them the pribilage not to overide  .

the RUNTIME POLYMORPHSIM IS ALSO CALLED THE LATE BINDING SINCE IT MAKES THE CODE RUN AFTER THE COMPLIATION .

if a class is declared as the final then all the attribues of the claass is implictly declared as final too. 


Can we overide a static ethod  ?
static method are independent class and they does not depend on the object class . 
so the
Dynamic method resoltion happens at the runtime hence this is called as the late uppper binding . 
final can prevent from the inheritance also  .
Static method can be inherited but cannot be overideen .

overiding depedn on  the objects  .
static deos not depend on the objects  , 
hence static method can neevr be overidden .
Static stuff eliminates all the objects  .
you can inheirt but you cannot overide  .

polymorphism thing does not apply to the instance variables  .
only apply to t static variables . 

both overlang and overiding does not apply to the instance variables . 






