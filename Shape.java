package caseStudy;

public abstract class Shape
{
 public void area()
 {
 }
 public static void main(String a[])
 {
  Shape s;
  s=new Triangle(30,20);
  s.area();
  s=new Rectangle(10,10);
  s.area();
  s=new Circle(20);
  s.area();
 }
}
class Triangle extends Shape
{
 double h,b;
 Triangle(double he,double ba)
 {
  h=he;
  b=ba;
 }
 public void area()
 {
  System.out.println("Area of Triangle is:"+(h*b)/2);
 }
}
class Rectangle extends Shape
{
 int h,l;
 Rectangle(int h,int l)
 {
  this.h=h;
  this.l=l;
 }
 public void area()
 {
  System.out.println("Area of Recangle is:"+(h*l));
 }
}
class Circle extends Shape
{
 double r;
 Circle(double r)
 {
  this.r=r;
 }
 public void area()
 {
  System.out.println("Area of Circle is:"+(3.14*r*r));
 }
}
