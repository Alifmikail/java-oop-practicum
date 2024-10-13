import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    // ArrayList untuk menyimpan daftar penerbangan dan pesanan tiket
    static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    static Penumpang penumpang;
    static Penerbangan penerbanganDipilih;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menambahkan beberapa data penerbangan
        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));
        
        int pilihanMenu = 0;

        do {
            // Menampilkan menu utama
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihanMenu = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihanMenu) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    beliTiket(input);
                    break;
                case 3:
                    tampilkanPesananTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihanMenu != 4);

        input.close();
    }

    // Method untuk menampilkan daftar penerbangan
    public static void tampilkanDaftarPenerbangan() {
        System.out.println("\nSilahkan pilih menu: 1\n");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ".");
            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
        }
        System.out.println();
    }

    // Method untuk pembelian tiket
    public static void beliTiket(Scanner input) {
        if (daftarPenerbangan.isEmpty()) {
            System.out.println("\nPembelian Tiket Tidak Ada\n");
            return;
        }

        System.out.println("\nSilahkan isi data diri anda terlebih dahulu\n");
        System.out.println("-----------------------------");
        System.out.print("Masukkan NIK: ");
        String NIK = input.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = input.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = input.nextLine();
        
        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

        System.out.println("\nTerima Kasih telah Mengisi Data Pelanggan.");
        System.out.println("Silahkan Pilih Tiket Penerbangan Yang Tersedia\n");

        // Menampilkan daftar penerbangan
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ".");
            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
        }

        // Memilih penerbangan
        System.out.print("\nPilih nomor penerbangan (ex: 1): ");
        int pilihan = input.nextInt();
        penerbanganDipilih = daftarPenerbangan.get(pilihan - 1);

        System.out.println("\nPemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)\n");
    }

    // Method untuk menampilkan pesanan tiket
    public static void tampilkanPesananTiket() {
        if (penumpang == null || penerbanganDipilih == null) {
            System.out.println("\nPembelian Tiket Tidak Ada\n");
        } else {
            System.out.println("\n======= Detail Tiket Penerbangan =======");
            System.out.println("Nomor Induk Kependudukan: " + penumpang.getNIK());
            System.out.println("Nama Depan : " + penumpang.getNamaDepan());
            System.out.println("Nama Belakang: " + penumpang.getNamaBelakang());
            System.out.println("Nomor Penerbangan: " + penerbanganDipilih.getNomorPenerbangan());
            System.out.println("Bandara Keberangkatan: " + penerbanganDipilih.getBandaraKeberangkatan() +
                               " ---> Bandara Tujuan: " + penerbanganDipilih.getBandaraTujuan());
            System.out.println("Waktu Keberangkatan: " + penerbanganDipilih.getWaktuKeberangkatan() + 
                               " ---> Waktu Kedatangan: " + penerbanganDipilih.getWaktuKedatangan());
            System.out.println("Harga Tiket: Rp." + penerbanganDipilih.getHargaTiket() + "\n");
        }
    }
}

class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    // Constructor
    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan,
                       String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    // Getter methods
    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    // Method untuk menampilkan detail penerbangan
    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp." + hargaTiket);
    }
}

class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }
}
