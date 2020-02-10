package shapes;
public class Triangle extends Shape{

	private double area;
	
	protected Triangle(final int height, final int base) {
		setArea(height, base);
	}
	
	private void setArea(final int height, final int base) {
		this.area = (double)height * (double)base;
		this.area = this.area / 2;
	}
	
	public double area() {
		return this.area;
	}
	
	public String name() {
		return "Triangle";
	}
	
}
