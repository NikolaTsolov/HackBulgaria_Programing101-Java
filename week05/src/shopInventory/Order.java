package shopInventory;

public class Order {
	private int _productID;
	private int _productQuantity;
	
	public Order(int productID, int productQuantity){
		this._productID = productID;
		this._productQuantity = productQuantity;
	}
	public int getProductID() {
		return _productID;
	}
	public int getProductQuantity() {
		return _productQuantity;
	}
	
	
}
