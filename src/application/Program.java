package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 950.0));
		list.add(new Product("phone", 85.0));
		list.add(new Product("Dvd", 40.0));
		list.add(new Product("Chair", 840.0));

		double factor = 1.1;
	
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
	

		}

	}


