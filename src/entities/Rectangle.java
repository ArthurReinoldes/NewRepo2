package entities;

public class Rectangle {
	
	public double Width;
	public double Height;
	
	public double Area() {
		return (Width * Height);
	}
	
	public double Perimeter() {
		return ((Width + Height)*2);
	}
	
	public double Diagonal() {
		return(Math.sqrt((Width * Width)+((Height * Height))));
	}

}
