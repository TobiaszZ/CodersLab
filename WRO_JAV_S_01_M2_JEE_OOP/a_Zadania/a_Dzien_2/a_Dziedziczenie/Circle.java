package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Circle extends Shape {
	private double radius;
	
	public Circle (double x, double y, String color, double radius){
		super(x,y,color);
		this.radius=radius;
		}
	@Override
	public String getDescription(){
		String baseDescription = super.getDescription();
				return Circle + baseDescription;
	}
	public double getArea(){
		
	}
}
