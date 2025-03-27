package chapter18;

import java.io.Serializable;

public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1382134324922734645L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() { return name + ": " + price; }
	

}
