package product;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Egg extends Product{
    private static final int SHELF_LIFE = 21;

    public Egg(LocalDate shelfLife, String name, int price) {
        super(shelfLife.plus(SHELF_LIFE, ChronoUnit.DAYS), name, price);
    }

    @Override
    public String toString() {
        return "Яйца: " + this.getName()
                + ", Стомостью: " + this.getPrice()
                + ", Срок годности: " + this.getDate();
    }
}
