package exampletwo;

public class Main {
    public static void main(String[] args) {
        Product[] produkty = new Product[5];
        produkty[0] = new Product("telefon", 100.55,"AGD");
        produkty[1] = new Product("Jablko", 2.50,"Jedzenie");
        produkty[2] = new Product("Tablet", 1450.50,"AGD");
        produkty[3] = new Product("Laptop", 7200,"AGD");
        produkty[4] = new Product("Koks", 350,"Uzywki");
        System.out.println("najtanszy produkt: " + najtanszyProdukt(produkty));
        System.out.println("najdrozszy produkt: " + najdrozszyProdukt(produkty));
        System.out.println("srednia cena produktow: " + sredniaCenaProduktow(produkty));


    }
    public static Product najtanszyProdukt(Product[] produkty){
        Product najtanszyProdukt = produkty[0];
        for (Product p : produkty) {
            if(p.getCena() < najtanszyProdukt.getCena()){
                najtanszyProdukt = p;
            }
        }
        return najtanszyProdukt;
    }
    public static Product najdrozszyProdukt(Product[] produkty){
        Product najdrozszyProdukt = produkty[0];
        for (Product p : produkty) {
            if(p.getCena() > najdrozszyProdukt.getCena()){
                najdrozszyProdukt = p;
            }
        }
        return najdrozszyProdukt;
    }
    public static double sredniaCenaProduktow(Product[] produkty){
        Product najdrozszyProdukt = produkty[0];
        double sredniaCenaProduktow = 0;
        double calkowitaCena = 0;
        for (Product p : produkty) {
           calkowitaCena += p.getCena();
        }
        sredniaCenaProduktow = calkowitaCena / produkty.length;
       return sredniaCenaProduktow;
    }

}
