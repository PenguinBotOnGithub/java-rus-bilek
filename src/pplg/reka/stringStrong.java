package pplg.reka;

public class stringStrong {
    public static void main(String[] args) {
        String middleName = "Ahadyan";
        String lastName = "Ilhamy";
        System.out.println(middleName + " " + lastName);
        String firstName = "Eureka ";
        System.out.println(firstName.concat(middleName));
        int kon = 90;
        System.out.println(kon + " " + lastName);
        // Penggunaan tanda \
        String hello = "\"Halo semuanya!, nama saya Reka!\"";
        System.out.println(hello);
        System.out.println("LOL\tLOL");

        String namaHaidarBesar = "HAIDAR";
        String namaHaidarKecil = "haidar";
        String namaHaidarNormal = "Haidar";
        System.out.println("Haidar kecil dan Haidar besar (equals) = " + namaHaidarKecil.equals(namaHaidarBesar));
        System.out.println("Haidar kecil dan Haidar besar (equalsIgnoreCase) = " + namaHaidarKecil.equalsIgnoreCase(namaHaidarBesar));
        System.out.println(namaHaidarNormal.length());
        String wow = namaHaidarBesar + namaHaidarKecil;
        System.out.println(wow.replace("haidar", "HAIDAR"));

    }
}
