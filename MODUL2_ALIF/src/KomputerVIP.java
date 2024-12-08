public class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    private boolean fasilitasVIP;

    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, String fasilitasVIP) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.fasilitasVIP = fasilitasVIP;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override
    @Override
    public void Informasi() {
        super.Informasi(); // Memanggil method Informasi dari parent class
       if(fasilitasVIP){
        System.out.println("benefit member VIP : \n - Diskon 10% untuk bermain diatas 3 jam \n - Gratis minuman setiap 4 jam bermain \n- Prioritas booking komputer gaming");
       }else
        System.out.println("Fasilitas VIP     : Benefit Member VIP: jgn ngarep benefit, maav :)");
    }

    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username) {
        System.out.println("Pengguna dengan username \"" + username + "\" berhasil login menggunakan komputer VIP.");
    }

    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(String namaGame) {
        System.out.println("Bermain game \"" + namaGame + "\" di komputer VIP.");
    }

    // To do: Buatlah method Bermain memakai Polymorphism Overloading
    public void Bermain(String namaGame, int durasi) {
        System.out.println("Bermain game \"" + namaGame + "\" di komputer VIP selama " + durasi + " jam.");
    }
}
