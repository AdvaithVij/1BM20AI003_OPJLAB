import java.io.*;
import java.util.Scanner;

class RetailItem
{
private String description;
private int units;
private double price;
RetailItem(String x, int y, double z)
{
 this.description=x;
 this.units = y;
 this.price = z;
}



 void setDesciption(String x)
{
this.description=x;
}
 void setPrice(double z)
{
this.price=z;
}

void setUnits(int y)
{
this.units=y;
}

int getUnits()
{
return units;
}
 String getDescription()
{
return description;
}

 double getPrice()
{
return price;
}
void display(){
System.out.println(this.description);

System.out.println(this.units);
System.out.println(this.price);
}
}
class one_a
{
public static void main(String [] args)
{
RetailItem s = new RetailItem("ball",4,34.5);
s.display();







}
}