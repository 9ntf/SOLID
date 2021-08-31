package shop;

import product.*;

import java.time.LocalDate;
import java.util.*;

public class Shop {
    private List<Product> products = new ArrayList<>();

    //Добавляем продукт
    public void addProduct(Goods goods, LocalDate data, String name, int price) {
        switch (goods) {
            case EGG:
                products.add(new Egg(data, name, price));
                break;
            case MILK:
                products.add(new Milk(data, name, price));
                break;
            case BREAD:
                products.add(new Bread(data, name, price));
                break;
            default:
                System.out.println("Невозможно добавить данный продукт");
                break;
        }
    }

    //Выводим на экран все доступные к продаже продукты
    public void productsAvailableToSale() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    //Покупаем продукт
    public Product buySmth(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    //Сортировка продуктов по имени
    public List<Product> filterByName(String name) {
        List<Product> result = new ArrayList<>();
       for (Product product : products) {
           if (product.getName().equals(name)) {
               result.add(product);
           }
       }
        return result;
    }

    //Сортировка продуктов по цене
    public List<Product> sortByPrice() {
        List<Product> result = new ArrayList<>(products);
        result.sort(Comparator.comparingInt(Product::getPrice));
        return result;
    }

    //Добавление продуктов в корзину
    public Product basket(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}