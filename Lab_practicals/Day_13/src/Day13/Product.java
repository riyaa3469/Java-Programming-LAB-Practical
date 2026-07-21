package Day13;

public class Product {
	String productId;
    String name;
    double price;
    int quantity;

    Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalValue() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("PRODUCT BILL");
        System.out.println("Product: " + this.productId + " - " + this.name);
        System.out.printf("Price: Rs. %.2f\n", this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.printf("Total Value: Rs. %.2f\n", this.calculateTotalValue());
}
}
