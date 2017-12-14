package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Shape {
	private double x;
	private double y;
	public String color;
	
	public Shape(double x, double y, String color){
		this.x=x;
		this.y=y;
		this.color = color;
		
	}
	
	public String getDescription(){
		String result ="x=" this.x + "y="+ this.y + "color:" + this.color;
		
	}	
	
	public double getDistance(Shape shape){
		Double result = 0.0 ;
		Double deltax = shape.x - this.x ;
		Double deltay = shape.y - this.y ;
		Double sumOfQuadrats = deltax * deltax + deltay * deltay;
		result = Math.sqrt(sumOfQuarts);
	}
		
}
//	
//	public class Circle extends Shape{
//	public int radius;
//	}
//	public Circle(double x, double y, String color, int radius){
//}
//	}
