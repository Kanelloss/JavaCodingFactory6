package gr.aueb.cf.ch20.productslambdas;

public class Product {
    private int ProductId;
    private String title;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int ProductId, String title, double price, int quantity) {
        this.ProductId = ProductId;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        this.ProductId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + ProductId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void printInstanceProduct() {
        System.out.println("ID: " + ProductId + ", Title: " + title + ", Price: " + price + ", Quantity: " + quantity);
    }

    public static void printStaticProduct(Product product) {
        System.out.println("ID: " + product.getProductId() +  ", Title: " + product.getTitle() + ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
    }
}


