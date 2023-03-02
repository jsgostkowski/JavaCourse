package clinic;

public class Main {
    public static void main(String[] args) {
        Clinic clinicOne = new Clinic("Klinika pierwsza", "adres pierwszy");
        Office officeOne = new Office(123, clinicOne);
        Office officeTwo = new Office(124, clinicOne);


        System.out.println(clinicOne.getOffice() + clinicOne.getName());
        System.out.println(officeOne.getClinic());
        System.out.println(officeTwo.getNumber());
        System.out.println(officeOne.getNumber());
    }
}
