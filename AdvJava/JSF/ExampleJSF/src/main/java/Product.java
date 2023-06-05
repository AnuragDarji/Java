import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="obj")
@SessionScoped
public class Product {
	private String name;
	private int qty;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String add()
	{
		System.out.println("Product Inserted....");
		System.out.println(name+" "+qty+" "+price);
		
		if(qty>10)
			return "fail";
		
		return "success";
	}
	
}
