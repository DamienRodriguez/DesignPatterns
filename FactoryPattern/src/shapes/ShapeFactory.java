package shapes;




public class ShapeFactory {
	
	public Circle createCircle(final int radius) {
		return new Circle(radius);
	}
	
	public Rectangle createRectangle(final int height, final int width) {
		return new Rectangle(height, width);
	}
	
	public Square createSquare(final int height) {
		return new Square(height);
	}
	
	public Triangle createTriangle(final int height, final int base) {
		return new Triangle(height, base);
	}

}
