public class Main {
    public static void main(String[] args) {

        // Membuat sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(10, "Warnet Ceria", 5000.0f);

        // Memanggil Method Informasi dari class Komputer
        komputer.Informasi();

        System.out.println();

        // Membuat sebuah Objek baru dari class KomputerVIP
        KomputerVIP komputerVIP = new KomputerVIP(5, "Warnet Mewah", 10000.0f, "Kursi Ergonomis dan Headset Gaming");

        // Memanggil Method Informasi dari class KomputerVIP
        komputerVIP.Informasi();

        // Memanggil Method Login
        komputerVIP.Login("PlayerOne");

        // Memanggil Method Bermain 2x untuk Polymorphism Overloading
        komputerVIP.Bermain("Valorant");
        komputerVIP.Bermain("DOTA 2", 3);

        System.out.println();

        // Membuat sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(3, "Warnet Premium", 15000.0f, "Kursi Premium dan PC High-End");

        // Memanggil Method Informasi dari class KomputerPremium
        komputerPremium.Informasi();

        // Memanggil Method Pesan
        komputerPremium.Pesan("Makanan Ringan");

        // Memanggil Method TambahLayanan 2x untuk Polymorphism Overloading
        komputerPremium.TambahLayanan("Layanan Game Streaming");
        komputerPremium.TambahLayanan("Layanan Cloud Gaming", 2);
    }
}
