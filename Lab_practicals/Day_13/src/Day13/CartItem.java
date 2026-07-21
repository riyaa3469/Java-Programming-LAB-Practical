package Day13;

public class CartItem {
	String itemName;
    double unitPrice;
    int quantity;

    CartItem(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    CartItem updateQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    double calculateAmount() {
        return unitPrice * quantity;
    }

    void display() {
        System.out.println("CART ITEM");
        System.out.println("Item: " + itemName);
        System.out.printf("Unit Price: Rs. %.2f\n", unitPrice);
        System.out.println("Updated Quantity: " + quantity);
        System.out.printf("Current Total: Rs. %.2f\n", calculateAmount());
}
}
