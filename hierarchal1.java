package caseStudy;

import java.util.Scanner;

public class hierarchal1 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int id,i;
        String name,desig;
        double sal;
        for(i=0;i<3;i++)
        {
            System.out.println("enter id of employee..");
            id=s.nextInt();
            System.out.println("enter name of employee..");
            name=s.next();
            System.out.println("enter designation of employee...");
            desig=s.next();
            System.out.println("enter salary of employee");
            sal=s.nextDouble();
            salary x=new salary(sal,desig,id,name);
            x.condition();
        }    
       // salary x=new salary(sal,desig,id,name);
       //x.condition();
    }
    
}
