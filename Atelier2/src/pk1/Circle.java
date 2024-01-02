package pk1;

public class Circle {
	private double radius = 1.0;
	private String color="red";
	
	public Circle() {
		
	}
	
	public Circle(double r) {
			radius=r;
	}
	
	public Circle (double r,String c) {
		radius=r;
		color=c;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRadius(double r) {
		radius=r;
	}
	
	public void setColor(String c) {
		color=c ;
	}
	
	public String toString() {
		return "the radius is "+radius+" , the color is "+color;
	}
	//π r^2
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	
	
}
