public class Product {
    String name;
    private int price;
    private String productCode;
    private int numberOfPieces;

    public Product(String name, int price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }

    public Product(String name, int price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        setNumberOfPieces(numberOfPieces);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfPieces(int numberOfPieces) throws IllegalArgumentException {
        if (numberOfPieces < 0) {
            throw new IllegalArgumentException("Number of pieces cannot be less than zero");
        }
        this.numberOfPieces = numberOfPieces;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }
}