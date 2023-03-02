//package example.one.uml;
//
//public class Main {
//    public static void main(String[] args) {
//        Osoba[] osoby = new Osoba[2];
//        osoby[0] = new Pracownik("Pracownik", "Pierwszy", "12345678912", "stanowisko 1", 400.00);
//        osoby[1] = new Student("Student", "Pierwszy", "12345678922", "12C", 152300.00);
//
//        for (Osoba o : osoby) {
//            System.out.println(o.getImie() + " " + o.getNazwisko() + " " + o.getPesel() + " ");
//        }
//        System.out.println("max placa: " + maxSalary(osoby));
//
//        //jak dobrac sie do pola pracownika/studenta w tablicy osoby
////        for (Osoba o : osoby) {
////            if(o instanceof Pracownik){
////                Pracownik p = (Pracownik) o;
////                System.out.println("Stanowisko w tablicy osoby: " + p.getStanowisko());
////            }
////        }
//
//        for (Osoba o : osoby) {
//            if (o instanceof Student) {
//                Student s = (Student) o;
//                System.out.println("Coś ze studenta: " + s.getGrupa());
//            }
//        }
//        System.out.println(osoby[1].getPlec());
//
//
//    }
//
//    public static Osoba maxSalary(Osoba[] person) {
//        Osoba maxSalary = person[0];
//        for (Osoba osoba : person) {
//            if (osoba.getDochod() > maxSalary.getDochod()) {
//                maxSalary = osoba;
//            }
//        }
//        return maxSalary;
//    }
//
//}
