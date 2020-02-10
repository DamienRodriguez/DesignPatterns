package shapes;
public class Square extends Shape{
	private double area;
	
	protected Square(final int height) {
		setArea(height);
	}
	
	private void setArea(final int height) {
		this.area = (double)height * height;
	}
	
	public double area() {
		return this.area;
	}
	
	public String name() {
		return "Square";
	}
}
