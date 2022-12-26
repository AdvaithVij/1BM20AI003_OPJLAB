//create an enum called size which signifies the size of pizza - regular,medium,large.
//create a class called test which has an instance of size,constructor, a method called order pizza which has a switch statement having the class labels of enum size.
//a driver class for main method creates an instance for test and orders pizza

enum size
{
regular,medium,large,extra_large}
class test
{
size psize;
public test(size pizza_size)
{
this.psize=pizza_size;
}
public void orderpizza()
{
switch(psize)
{
case regular: System.out.println("I ordered regular pizza");
break;
case medium: System.out.println("I ordered medium pizza");
break;
case large: System.out.println("I ordered large pizza");
break;
case extra_large: System.out.println("I ordered extra large pizza");
break;
default: System.out.println("No money No pizza");
break;
}
}
}

class pizza
{
public static void main(String args[])
{
size s = size.regular;
test t= new test(s);
t.orderpizza();
}
}

