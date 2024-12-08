public class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    private String layananPremium;

    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, String layananPremium) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.layananPremium = layananPremium;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override
   @Override 
    public void Informasi() {
        super.Informasi(); // Memanggil method Informasi dari parent class
        System.out.println("Layanan Premium   : " + layananPremium);
    }

    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(String namaPelanggan) {
        System.out.println("Pelanggan " + namaPelanggan + " telah memesan layanan premium.");
    }

    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String namaLayanan) {
        System.out.println("Layanan tambahan " + namaLayanan + " berhasil ditambahkan.");
    }

    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading
    public void TambahLayanan(String namaLayanan, int biaya) {
        System.out.println("Layanan tambahan " + namaLayanan + " berhasil ditambahkan dengan biaya Rp " + biaya);
    }
}
