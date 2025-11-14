package entities;

public class Rectangle_2 {
	public double Width;
	public double Height;

	public double area() {
		return Width * Height;
	}

	public double perimeter() {
		return 2 * (Width + Height);
	}

	public double diagonal() {
		double calc = (Width * Width) + (Height * Height);
		return Math.sqrt(calc);
	}
}
