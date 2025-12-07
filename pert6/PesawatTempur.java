public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int jumlahRudal
    private int jumlahRudal;
    private static final double KON_ENERGI_PER_KM = 3.0;
    private static final int ENERGI_MIN_AKTIF = 20;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - jumlahRudal
    // Panggil super(...) untuk parent.
    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        // Panggil constructor parent
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 20 → tampilkan "Energi terlalu rendah! Mesin tidak dapat diaktifkan."
    // Jika cukup → tampilkan "Mesin pesawat tempur diaktifkan."
    @Override
    public void aktifkanMesin() {
        if (levelEnergi < ENERGI_MIN_AKTIF) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    // @Override jelajah(int jarak)
    // Konsumsi energi: 3% per 1 km.
    // Jika energi tidak cukup → tampilkan pesan gagal.
    // Jika cukup → kurangi energi dan tampilkan:
    // "Pesawat tempur menjelajah sejauh [jarak] km."
    @Override
    public void jelajah(int jarak) {
        double energiDibutuhkan = jarak * KON_ENERGI_PER_KM;

        if (levelEnergi < energiDibutuhkan) {
            System.out.printf("Energi tidak mencukupi untuk menjelajah sejauh %d km.%n", jarak);
        } else {
            // Kurangi energi
            levelEnergi -= (int) energiDibutuhkan;
            System.out.printf("Pesawat tempur menjelajah sejauh %d km.%n", jarak);
        }
    }

    // @Override isiEnergi(int jumlah)
    // Tambah energi sampai max 100%.
    // Tampilkan pesan peningkatan energi.
    @Override
    public void isiEnergi(int jumlah) {
        levelEnergi = Math.min(100, levelEnergi + jumlah);
        System.out.printf("Peningkatan energi pesawat tempur sebesar %d%%. Energi saat ini: %d%%%n", jumlah, levelEnergi);
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void tembakRudal(int jumlah)
    // - Jika jumlahRudal cukup → kurangi dan tampilkan:
    //   "Menembakkan [jumlah] rudal!"
    // - Jika tidak cukup → tampilkan pesan gagal.
    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.printf("Menembakkan %d rudal!%n", jumlah);
        } else {
            System.out.printf("Gagal menembak. Jumlah rudal tidak mencukupi. Sisa rudal: %d%n", jumlahRudal);
        }
    }

    public int getJumlahRudal() {
        return jumlahRudal;
    }
}
