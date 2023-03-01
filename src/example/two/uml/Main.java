package example.two.uml;

public class Main {
    public static void main(String[] args) {
        Product[] produkty = {
                new Product("telefon", 100.55, "AGD"),
                new Product("Jablko", 2.50, "Jedzenie"),
                new Product("Tablet", 1450.50, "AGD"),
                new Product("Laptop", 725500, "AGD"),
                new Product("Koks", 350, "Uzywki"),
        };
        System.out.println("najtanszy produkt: " + cheapestProduct(produkty));
        System.out.println("najdrozszy produkt: " + mostExpensiveProduct(produkty));
        System.out.println("srednia cena produktow: " + averageProductPrice(produkty));


    }

    public static Product cheapestProduct(Product[] products) {
        Product p = products[0];
        for (Product product : products) {
            if (product.getCena() < p.getCena()) {
                p = product;
            }
        }
        return p;
    }

    public static Product mostExpensiveProduct(Product[] products) {
        Product p = products[0];
        for (Product product : products) {
            if (product.getCena() > p.getCena()) {
                p = product;
            }
        }
        return p;
    }

    public static double averageProductPrice(Product[] products) {
        double average = 0;
        double totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getCena();
        }
        average = totalPrice / products.length;
        return average;
    }

}
