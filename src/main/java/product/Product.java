package product;

import java.time.LocalDate;

public abstract class Product {
    private LocalDate date;
    private String name;
    private int price;

    protected Product(LocalDate date, String name, int price) {
        this.date = date;
        this.name = name;
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
