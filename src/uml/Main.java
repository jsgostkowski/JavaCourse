package uml;

public class Main {
    public static void main(String[] args) {
        Szkola s1 = new Szkola("szkola jeden", 1995,1,"T");
        Szkola s2 = new Szkola("szkola dwa", 2000,2);
        s1.dodajProfil("Fizyczny");
        s1.dodajProfil("Matematyczny");
        s2.dodajProfil("Informatyczny");
    }
}
