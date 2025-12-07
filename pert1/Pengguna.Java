class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas
    int umur;
    double berat;
    double tinggi;
    public static final double faktorAktivitas=1.2;

    double hitungBMI() {
        // Lengkapi method ini
        double tinggiMeter= tinggi/100;
        double bmi=berat/(tinggiMeter*tinggiMeter);
        return bmi;
    }

    void tampilKategori() {
        // Lengkapi method ini
        double bmi=hitungBMI();
        String kategori;

        if (bmi<18.5){
            kategori="Kurus";
        } else if (bmi<25) {
            kategori="Normal";
        }else {
            kategori="Obesitas";
        }
        System.out.println("Kategori: "+kategori);
    }

    double hitungKalori() {
        // Lengkapi method ini
        double kalori=berat*faktorAktivitas*10;
        return kalori;
    }

    void tampilInfo() {
        // Lengkapi method ini
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: "+umur+" tahun");
        System.out.println("Berat: "+berat+" kg");
        System.out.println("Tinggi: "+tinggi+" cm");
        double bmi=hitungBMI();
        System.out.println("BMI: "+bmi);
        tampilKategori();
        double kalori=hitungKalori();
        System.out.println("Kebutuhan Kalori: "+kalori);
        System.out.println("====================================");
    }
}