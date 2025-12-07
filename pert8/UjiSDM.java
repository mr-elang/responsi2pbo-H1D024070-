public class UjiSDM {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");
        // ==========================================================
        // DATA UJI COBA
        // ==========================================================
        
        // 1. BUAT OBJEK ProgrammerMagang
        // Gunakan constructor dengan data: "Andi", 50000.0, "1234".
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");
        
        // 2. PENGUJIAN METODE BERURUTAN

        // Panggil method hitungGaji(160).
        andi.hitungGaji(160);
        // Cetak hasil dari method getStatusCuti().
        System.out.println("Status Cuti: " + andi.getStatusCuti());
        // Panggil login("9999") (Tes PIN salah).
        andi.login("9999");
        // Panggil login("1234") (Tes PIN benar).
        andi.login("1234");
        // Cetak hasil dari method getRoleAkses().
        System.out.println("Role Akses: " + andi.getRoleAkses());
        // Panggil perpanjangKontrak(6).
        andi.perpanjangKontrak(6);
        // Panggil logout().
        andi.logout();
    }
}