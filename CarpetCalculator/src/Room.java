
public class Room {

	private double length;
	private double width;

	public Room(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "Room [length=" + length + ", width=" + width + "]";
	}

}