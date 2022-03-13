package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.id=1;
		product1.name="phone";
		
		Product product2 = new Product(2,"laptop");
		
		Product[] products = {product1,product2};
		
		for (Product product :products)
		{
			System.out.println(product.id);
		}
		
		ProductManager productmanager = new ProductManager();
		productmanager.addToCart(product1);
	}

}
