package poo.q01.src.entities;

public class Rectangle {
	private double width;
	private double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (2 * width) + (2 * height);
	}

	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "AREA = " + String.format("%.2f", area()) + "\nPERIMETER = " + String.format("%.2f", perimeter())
				+ "\nDIAGONAL = " + String.format("%.2f", diagonal());
	}
}
