public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int modulScan   // kemampuan scan planet (level 1–5)
    private int modulScan;
    private static final double KON_ENERGI_PER_KM = 2.0;
    private static final int ENERGI_MIN_MISI = 15;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - modulScan
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        // Panggil constructor parent
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 15 → "Energi tidak mencukupi untuk memulai ekspedisi!"
    // Jika cukup → "Kapal eksplorasi siap berangkat!"
    @Override
    public void aktifkanMesin() {
        if (levelEnergi < ENERGI_MIN_MISI) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    // @Override jelajah(int jarak)
    // Konsumsi energi: 2% per 1 km (lebih efisien).
    // Jika cukup → kurangi energi & tampilkan jarak perjalanan.
    @Override
    public void jelajah(int jarak) {
        double energiDibutuhkan = jarak * KON_ENERGI_PER_KM;

        if (levelEnergi < energiDibutuhkan) {
            System.out.printf("Energi tidak mencukupi untuk menjelajah sejauh %d km.%n", jarak);
        } else {
            // Kurangi energi
            levelEnergi -= (int) energiDibutuhkan;
            System.out.printf("Kapal eksplorasi menjelajah sejauh %d km.%n", jarak);
        }
    }

    // @Override isiEnergi(int jumlah)
    // Tambah energi secara bertahap sampai 100%.
    // Tampilkan pesan pengisian.
    @Override
    public void isiEnergi(int jumlah) {
        int energiAwal = levelEnergi;
        levelEnergi = Math.min(100, levelEnergi + jumlah);
        System.out.printf("Pengisian energi kapal eksplorasi. Energi naik dari %d%% menjadi %d%%%n", energiAwal, levelEnergi);
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void scanPlanet(String namaPlanet)
    // Tampilkan:
    // "Melakukan scan pada planet [namaPlanet] dengan modul level [modulScan]."
    public void scanPlanet(String namaPlanet) {
        System.out.printf("Melakukan scan pada planet %s dengan modul level %d.%n", namaPlanet, modulScan);
    }
}
