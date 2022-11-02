package studio7;

public class rectangle 
{
	private double width;
	private double height;
	
	public rectangle(double initWidth, double initHeight){
		this.width = initWidth;
		this.height = initHeight;
	}

	public double getArea() {
		double area = width * height;
		return area;
	}
	
	public boolean isSquare() {
		if (width==height) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getPerimeter() {
		return (2*width) + (2*height);
	}
	public boolean isBigger(rectangle r) {
		if ((this.width * this.height) > r.getArea()) {
			return true;
		}
		return false;
	}
	}

