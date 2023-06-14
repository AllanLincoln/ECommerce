public class Product {
    private String name;
    private double price;
    private String description;

    private double peso;

    public Product(String name, double price, String description, double peso) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getPeso(){ return peso;}
}
