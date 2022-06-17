
import java.util.ArrayList;

public class CarpetCalculator  {

	private float pricePerSquareft;
	private float installationCharge;
	private ArrayList<Room> rooms;

	public CarpetCalculator(float pricePerSquareft) {
		this.pricePerSquareft = pricePerSquareft;
		rooms = new ArrayList<Room>();
	}

	public CarpetCalculator(float pricePerSquareft, float installationCharge)  {
		this.pricePerSquareft = pricePerSquareft;
		this.installationCharge = installationCharge;
		rooms = new ArrayList<Room>();
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public String getTotalCost() {
		double totalCost = 0;
		for (Room room : this.rooms) {
			totalCost += (room.getArea() * this.pricePerSquareft);
		}
		totalCost += this.installationCharge;
		return "$" + totalCost;
	}

	public void addPercentDiscount(float percentDiscount) {
		this.pricePerSquareft *= (1.00 - (percentDiscount / 100));
		this.installationCharge *= (1.00 - (percentDiscount) / 100);
	}
}