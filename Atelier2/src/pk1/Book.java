package pk1;

public class Book  {
	private String name;
	private Author author;
	private double price ;
	static int qty=0;
	
	
	public Book(String n,Author a,double p) {
		name=n;
		author=a;
		price=p;
		qty+=1;
		
		double min=p;
		double max=p;
		if(this.price>max) {
			max=price;
		}
	}
	
	public Book(String n,Author a,double p,int q) {
		name=n;
		author=a;
		price=p;
		qty+=q;
	}
	
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		price=p;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int q) {
		qty=q;
	}
	
	public String toString() {
        return "Book Name: " + name + "\nAuthor: " + author.getName() +
               "\nPrice: $" + price + "\nQuantity: " + qty;
    }
	
	
}
