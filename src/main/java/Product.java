public class Product {
    private String code;
    private Color color;
    private Size size;
    private Price price;

    public Product(String code, Color color, Size size, Price price) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price.getAmount();
    }

    public String getCurrency() {
        return price.getCurrency();
    }
}