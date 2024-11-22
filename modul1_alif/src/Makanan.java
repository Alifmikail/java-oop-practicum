// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    private ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    private ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahMakananKering() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama Makanan Kering: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Makanan Kering: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Makanan Kering: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Masukkan Brand Makanan Kering: ");
        String brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering
        MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(makananKering);

        // Todo : Create Print Notification "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan!");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Masukkan Nama Makanan Basah: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Makanan Basah: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Makanan Basah: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Masukkan Bahan Makanan Basah: ");
        String bahan = scanner.nextLine();

        // Todo : Create a new object for MakananBasah
        MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(makananBasah);

        // Todo :Create Print Notification "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan basah berhasil ditambahkan!");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan di sini.");
        } else {
            // Todo : Create print notification for Makanan Kering  
            if (!daftarMakananKering.isEmpty()) {
                System.out.println("Daftar Makanan Kering:");
                for (MakananKering mk : daftarMakananKering) {
                    mk.showData();
                }
            }

            // Todo : Create print notification for Makanan Basah
            if (!daftarMakananBasah.isEmpty()) {
                System.out.println("Daftar Makanan Basah:");
                for (MakananBasah mb : daftarMakananBasah) {
                    mb.showData();
                }
            }
        }
    }
}


