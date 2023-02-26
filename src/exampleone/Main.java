package exampleone;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[2];
        osoby[0] = new Pracownik("Pracownik", "Pierwszy", "12345678912", "stanowisko 1", 400.00);
        osoby[1] = new Student("Student", "Pierwszy", "12345678922", "12C", 152300.00);

           for (Osoba o : osoby) {
                System.out.println(o.getImie() +" "+ o.getNazwisko() +" "+ o.getPesel() + " ");
            }

           //jak dobrac sie do pola pracownika/studenta w tablicy osoby
        for (Osoba o : osoby) {
            if(o instanceof Pracownik){
                Pracownik p = (Pracownik) o;
                System.out.println("Stanowisko w tablicy osoby: " + p.getStanowisko());
            }
        }
        for (Osoba o : osoby) {
            if(o instanceof Student){
                Student s = (Student) o;
                System.out.println("Coś ze studenta: " + s.getGrupa());
            }
        }
        System.out.println(osoby[1].getPlec());


        Osoba osobaZNajwiekszymDochodem = osoby[0];
        double najwiekszyDochod = osobaZNajwiekszymDochodem.getDochod();
        for (int i = 1; i < osoby.length; i++) {
            double dochod = osoby[i].getDochod();
            if (dochod > najwiekszyDochod) {
                najwiekszyDochod = dochod;
                osobaZNajwiekszymDochodem = osoby[i];
            }
        }
        System.out.println("Osoba z najwiekszym wynagrodzeniem: " + osobaZNajwiekszymDochodem);
    }

}
