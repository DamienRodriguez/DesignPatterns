package shapes;
public class Circle extends Shape {
	private double area;
	
	protected Circle(final double radius) {
		setArea(radius);
	}
	
	private void setArea(final double radius) {
		this.area = Math.PI * radius * radius;
	}
	
	public String name() {
		return "Circle";
	}
	
	public double area() {
		return this.area;
	}

}
