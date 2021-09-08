package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 950.0));
		list.add(new Product("phone", 85.0));
		list.add(new Product("Dvd", 40.0));
		list.add(new Product("Chair", 840.0));

 list.removeIf(new ProductPredicate());

 for (Product p : list) {
	 System.out.println(p);
	 
 }
 
	
	}

}
