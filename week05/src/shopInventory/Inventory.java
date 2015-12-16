package shopInventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private static ArrayList<Product> _products = new ArrayList<>();

	public Inventory(List<Product> input) {
		_products.addAll(input);
	}

	public static double audit() {
		double sumAllPrices = 0.0;
		for (Product item : _products) {
			sumAllPrices = sumAllPrices + item.getPriceAfterTax();
		}
		return sumAllPrices;
	}

	public void requestOrder(Order order) {
		for (Product item : _products) {
			if (order.getProductID() == item.getProductID()) {
				try {
					if (item.getProductQuantity() < order.getProductQuantity()) {
						throw new NotAvailableInInventoryException();
					}

				} catch (NotAvailableInInventoryException naie) {
					System.out.println("Not Available");
				}
				item.setProductQuantity(item.getProductQuantity() - order.getProductID());
			}
		}
	}
}
