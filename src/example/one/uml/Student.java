//package example.one.uml;
//
//public class Student extends Osoba {
//    private String grupa;
//    private double stypendium;
//
//
//    public Student(String imie, String nazwisko, String pesel, String grupa, double stypendium) {
//        super(imie, nazwisko, pesel);
//        this.grupa = grupa;
//        this.stypendium = stypendium;
//    }
//
//    public String getGrupa() {
//        return grupa;
//    }
//
//    public void setGrupa(String grupa) {
//        this.grupa = grupa;
//    }
//
//    public double getStypendium() {
//        return stypendium;
//    }
//
//    public void setStypendium(double stypendium) {
//        this.stypendium = stypendium;
//    }
//
//    @Override
//    public double getDochod() {
//        return stypendium;
//    }
//
//
//    public String getPlec() {
//        String pesel = getPesel();
//        int l = Integer.parseInt(pesel.substring(9,10));
//        if(l%2==0){
//            return "K";
//        }else {
//            return "M";
//        }
//    }
//
//    @Override
//    public String toString() {
//        return getImie() + " " + getNazwisko()+ " "+grupa + " " + stypendium ;
//    }
//
//}
