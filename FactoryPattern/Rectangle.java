package shapes;
public class Rectangle extends Shape {
	private double area;
	
	protected Rectangle(final int height, final int width) {
		setArea(height,width);
	}
	
	
	private void setArea(final int height, final int width) {
		this.area = (double)height * width;
	}
	
	public double area() {
		return this.area;
	}
	
	public String name() {
		return "Rectangle";
	}
}
