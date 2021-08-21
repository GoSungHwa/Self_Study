package ncs.test5;

public class Phone {
	String model; //폰명
	int price; //가격
	String manufacture; //회사
	int quantity; //개수

	public Phone() {

	}

	public Phone(String model, int price, String manufacture,int quantity) {
		this.model=model;
		this.price=price;
		this.manufacture=manufacture;
		this.quantity=quantity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", price=" + price + ", manufacture=" + manufacture + ", quantity=" + quantity
				+ "]";
	}
	
}
