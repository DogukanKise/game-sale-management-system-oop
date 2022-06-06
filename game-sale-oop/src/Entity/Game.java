package Entity;

public class Game extends Entity {
	private String name;
	private double price;
	private double priceAfterDiscount;
	
	public Game() {
		
	}

	public Game(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}
	
	
	
}
