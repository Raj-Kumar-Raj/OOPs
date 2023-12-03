// PROGRAM USING THE FOUR PILLARS OF OOP( INHERITANCE, ENCAPSULAION, ABSTRACTION, POLYMORPHISM)

import java.util.Scanner;


abstract class Shape 
{
    float area;
    
     abstract public void acceptInput();

     abstract public void compute(); 

    public void disp()
    {
        System.out.println("Area of the figure is: " + area);
        System.out.println("______________________________________________");
    }
}

class Square extends Shape   
{
    private float length;  
    

    public void acceptInput() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the square:");
        length = scan.nextFloat();
        
    }

    public void compute() 
    {
        area = length * length;
    }
}

class Rectangle extends Shape 
{
    private float length;
    private float breadth;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the length of the rectangle:");
        length = scan.nextFloat();
        System.out.println("Enter the breadth of the rectangle:");
        breadth = scan.nextFloat();
    }

    public void compute()
    {
        area = length * breadth;
    }
}

class Circle extends Shape
{
    private float radius ;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius = scan.nextFloat();
    }
    public void compute()
    {
        area = 3.14f * radius * radius ;
    }
}

class Geometry 
{
    public void permit(Shape ref)
    {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}

 class Area3
{
    public static void main(String[]args)
    {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        
       Geometry g = new Geometry();
       g.permit(s);
       g.permit(r);
       g.permit(c);

       System.out.println("Thankyou");
    } 
}