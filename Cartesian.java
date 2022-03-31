package caseStudy;

import java.lang.Exception;

class Cartesian extends Exception
{
 double result;
 double x,y,z;
 Cartesian()
 {
 
 }
 Cartesian(double x,double y,double z)
 {
  this.x=x;
  this.y=y;
  this.z=z;
 }
 
 void display()
 {
  System.out.println("value of x = "+x);
  System.out.println("value of y = "+y);
  System.out.println("value of z = "+z);
 }
 
 void add_coordinates() throws Cartesian
 {
  result=x+y+z;
   System.out.println("the Addition of these three coordinates is"+result);
  if(result == 0)
  {
   throw new Cartesian();
  }
  
 
  
 }
 
 public static void main(String [] args)
 {
  Cartesian obj=new Cartesian(8,6,-25);
  obj.display();
  
  
  try
  {
   obj.add_coordinates();
  }
  catch(Cartesian j)
  {
   System.out.println("Exception Generated \n try different coordiante");
  }
  
 }
 
}

