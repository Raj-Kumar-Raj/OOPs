// PROGRAM WITHOUT USING THE FOUR PILLARS OF OOP.
    

import java.util.Scanner;

class Square
{
    float length;
    float area ;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Square:");
        length = scan.nextFloat();
    }

    public void compute()
    {
        area = length*length ; 
    } 

    public void disp()
    {
        System.out.println("Area of the square is: " + area);
        System.out.println("______________________________________________");
    }
}

class Rectangle
{
    float length;
    float breadth;
    float area;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = scan.nextFloat();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = scan.nextFloat();
        
    }

    public void compute()
    {
        area = length * breadth;
    }

    public void disp()
    {
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("______________________________________________");
    }
}

class Circle
{
    float radius;
    float area;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = scan.nextFloat();
    }

    public void compute()
    {
        area = 3.14f * radius * radius;
    }

    public void disp()
    {
        System.out.println("Area of the cicle is: " + area);
        System.out.println("______________________________________________");
        System.out.println("Thankyou");
    }
}
public class Area

{
   public static void main(String[]args)
   {
      Square s = new Square();
      Rectangle r = new Rectangle();
      Circle c = new Circle();

      s.acceptInput();
      s.compute();
      s.disp();

      r.acceptInput();
      r.compute();
      r.disp();

      c.acceptInput();
      c.compute();
      c.disp();
   }    
}