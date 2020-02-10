package shapes;
public abstract class Shape implements Comparable<Shape> {
	public abstract double area();
	public abstract String name();
	
	
	public int compareTo(final Shape that) {
		if(this.name().compareTo(that.name()) > 0) 
			return 1;
		if(this.name().compareTo(that.name()) < 0)
			return -1;
		if(this.area() >that.area())
			return 1;
		if(this.area() < that.area())
			return -1;
		return 0;
	}
}
