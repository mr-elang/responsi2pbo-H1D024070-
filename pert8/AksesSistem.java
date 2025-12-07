public interface AksesSistem {
    
    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================
    
    // DEKLARASI METHOD 1: login
    // Menerima satu parameter: String pin
    // Mengembalikan nilai: void
    public void login(String pin);
    
    // DEKLARASI METHOD 2: logout
    // Tidak menerima parameter
    // Mengembalikan nilai: void
    public void logout();
    
    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================
    
    // DEKLARASI DEFAULT METHOD: getRoleAkses
    // Tidak menerima parameter
    // Mengembalikan nilai: String "Staff Biasa"
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}