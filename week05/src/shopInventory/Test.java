package shopInventory;

import java.util.ArrayList;
import java.util.List;

import vatTaxCalculator.CountryVatTax;

public class Test {
	
	
	public static void main(String[] args) {
		CountryVatTax two = new CountryVatTax(2, 0.20, false);
		CountryVatTax tree = new CountryVatTax(3, 0.30, false);
		CountryVatTax one = new CountryVatTax(1, 0.15, true);
		
		
		Product eggs = new Product(10, "eggs", two, 20, 2);
		Product milk = new Product(20, "milk", tree, 10, 3);
		Product apples = new Product(6, "apples", one, 60, 1);
		
		List<Product> input = new ArrayList<>();
		
		input.add(eggs);
		input.add(milk);
		input.add(apples);
		
		Inventory inv = new Inventory(input);
		
		Order firstOrder = new Order(1, 10);
		
		inv.requestOrder(firstOrder);
		System.out.println(Inventory.audit());
	}
	
}
