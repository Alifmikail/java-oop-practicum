// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Todo : Create Loop list menu
        do {
            System.out.println("=== Menu Manajemen Inventaris ===");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Tambah Makanan Kering
                    manajemenInventaris.tambahMakananKering();
                    break;
                case 2:
                    // Tambah Makanan Basah
                    manajemenInventaris.tambahMakananBasah();
                    break;
                case 3:
                    // Tampilkan Semua Makanan
                    manajemenInventaris.tampilkanSemuaMakanan();
                    break;
                case 4:
                    // Keluar
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            System.out.println(); // Untuk memberikan spasi setelah setiap iterasi

        } while (pilihan != 4);

        scanner.close(); // Menutup scanner setelah loop selesai
    }
}
