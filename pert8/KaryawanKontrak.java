public interface KaryawanKontrak {
    
    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================
    
    // DEKLARASI METHOD 1: hitungGaji
    // Menerima satu parameter: int jamKerja
    // Mengembalikan nilai: double (total gaji)
    double hitungGaji(int jamKerja);
    
    // DEKLARASI METHOD 2: perpanjangKontrak
    // Menerima satu parameter: int durasiBulan
    // Mengembalikan nilai: void
    void perpanjangKontrak(int durasiBulan);
    
    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================
    
    // DEKLARASI DEFAULT METHOD: getStatusCuti
    // Tidak menerima parameter
    // Mengembalikan nilai: String "Tersedia 12 hari"
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}