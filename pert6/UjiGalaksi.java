public class UjiGalaksi {
    public static void main(String[] args) {
        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");
        System.out.println();
        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        PesawatTempur astraFury = new PesawatTempur("Astra-Fury", 2, 8);

        // TODO:
        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        KapalEksplorasi voyagerX = new KapalEksplorasi("Voyager X", 10, 4);

        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        // TODO:
        // Aktifkan mesin pesawat
        // Pesawat menjelajah 10 km
	// Pesawat menjelajah 30 km
        // Pesawat menembak 3 rudal
        // Tampilkan status pesawat
        System.out.println("--- PESAWAT TEMPUR ---");
        astraFury.aktifkanMesin();
        astraFury.jelajah(10);
        astraFury.jelajah(30);
        astraFury.tembakRudal(3);
        astraFury.tampilStatus();

        // TODO:
        // Aktifkan mesin kapal eksplorasi
        // Kapal menjelajah 15 km
        // Kapal melakukan scanPlanet("Kepler-442b")
        // Tampilkan status kapal
        System.out.println();
        System.out.println("--- KAPAL EKSPLORASI ---");
        voyagerX.aktifkanMesin();
        voyagerX.jelajah(15);
        voyagerX.scanPlanet("Kepler-442b");
        voyagerX.tampilStatus();
    }
}
