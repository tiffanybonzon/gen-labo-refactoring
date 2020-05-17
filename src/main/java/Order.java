import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }
}
