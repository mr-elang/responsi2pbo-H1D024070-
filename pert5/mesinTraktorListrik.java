class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    private double kapasitasBaterai;

    // Constructor
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        // Override info traktor listrik
        System.out.println("Mesin Traktor Listrik "+namaMesin+" | Tarik: "+kapasitasTarik+" | Baterai: "+kapasitasBaterai+" kWh | Tenaga: "+tenagaHP+" HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor listrik
        return (super.tenagaHP * 0.9) + (this.kapasitasBaterai * 10.0);
    }

    @Override
    String kategoriMesin() {
        // Override kategori listrik
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        // Suara traktor listrik
        System.out.println(namaMesin+" → Bzzzzz! Mesin traktor listrik aktif!");
    }
}
