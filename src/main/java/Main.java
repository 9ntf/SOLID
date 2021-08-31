import product.Bread;
import product.Egg;
import product.Goods;
import product.Product;
import shop.Shop;
import sun.util.resources.LocaleData;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Shop shop = new Shop();

        //Добавляем продукты доступные для продажи
        shop.addProduct(Goods.BREAD, date, "Подольский", 100);
        shop.addProduct(Goods.BREAD, date, "Бородинский", 70);
        shop.addProduct(Goods.EGG, date, "Уссурийское", 150);
        shop.addProduct(Goods.EGG, date, "Благовещенское", 180);
        shop.addProduct(Goods.MILK, date, "ГринАгро", 230);
        shop.addProduct(Goods.MILK, date, "Белый город", 130);

        //Считаем что поток main и есть наш покупатель
        //Продукты доступные для покупки
        shop.productsAvailableToSale();

        //Составляем коризину
        List<Product> basket = new ArrayList<>();
        basket.add(shop.basket("Подольский"));
        basket.add(shop.basket("Уссурийское"));
        basket.add(shop.basket("Благовещенское"));
        basket.add(shop.basket("Подол3ьский"));

        //Получаем список продуктов отфильтрованный по имени
        List<Product> filteredByName = shop.filterByName("Подольский");
        for (Product product : filteredByName) {
            System.out.println(product);
        }

        //Список доступных продуктов отсортированный по цене
        List<Product> sortedByPrice = shop.sortByPrice();
        for(Product product : sortedByPrice) {
            System.out.println(product);
        }
    }
}