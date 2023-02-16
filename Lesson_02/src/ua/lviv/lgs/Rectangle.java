package ua.lviv.lgs;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle() {
		this.width = 24;
		this.length = 15;
	}

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;

	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int countPerimeter(int width, int length) {
		int perimeter = (width + length) * 2;
		return perimeter;
	}

	public int countArea(int width, int length) {
		int area = width * length;
		return area;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}
