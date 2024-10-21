abstract class Shape
{
	int a,b;
	Shape(int c,int d)
	{
   		a=c;
   		b=d;
	 }
 	abstract double printArea();
}


class Rectangle extends Shape
{
  	Rectangle(int c,int d)
  	{
   	 	super(c,d);
  	}
 	double printArea()
 	{
  		return a*b;
 	}
}


class Triangle extends Shape
{
   	Triangle(int c,int d)
 	{
  		super(c,d);
 	}
 	double printArea()
 	{
  		return 05*a*b;
 	}
}


class Circle extends Shape
{
 	Circle(int c)
 	{
  		super(c,0);
 	}
 	double printArea()
 	{
  		return 3.14*a*a;
 	}
}


class Cn
{
  	public static void main(String args[])
 	{
   		Rectangle r =new Rectangle(2,3);
   		Triangle t = new Triangle(3,6);
   		Circle c=new Circle(3);
  		System.out.println("Area of Rectangle is:"+" "+r.printArea());
  		System.out.println("Area of triangle is:"+" "+t.printArea());
  		System.out.println("Area of circle is:"+" "+c.printArea());

 	}
}

 