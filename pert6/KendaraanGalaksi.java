public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================

    // TODO:
    // - String namaKendaraan
    // - int levelEnergi         (0–100)
    // - int kapasitasPenumpang
    protected String namaKendaraan;
    protected int levelEnergi;
    protected int kapasitasPenumpang;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    // levelEnergi default = 100.
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }


    // ==========================================================
    // GETTER
    // ==========================================================

    // TODO: Getter namaKendaraan
    // TODO: Getter levelEnergi
    // TODO: Getter kapasitasPenumpang
    public String getNamaKendaraan() {
        return namaKendaraan;
    }
    public int getLevelEnergi() {
        return levelEnergi;
    }
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    // TODO:
    // Method final tampilStatus()
    // Format:
    // "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] awak"
    public final void tampilStatus() {
        System.out.printf("%s | Energi: %d%% | Kapasitas: %d awak%n",
                namaKendaraan, levelEnergi, kapasitasPenumpang);
    }


    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    // TODO:
    // abstract void aktifkanMesin();
    public abstract void aktifkanMesin();

    // TODO:
    // abstract void jelajah(int jarak);
    public abstract void jelajah(int jarak);

    // TODO:
    // abstract void isiEnergi(int jumlah);
    public abstract void isiEnergi(int jumlah);
}
