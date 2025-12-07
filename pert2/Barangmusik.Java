class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    String kodeBarang;
    String namaAlat;
    double hargaSatuan;
    int jumlahStok;
    
    // Constructor
    public BarangMusik(String kode, String nama){
        this.kodeBarang=kode;
        this.namaAlat=nama;
        this.hargaSatuan=0;
        this.jumlahStok=0;
    }
    public BarangMusik(String kode, String nama, double harga){
        this(kode, nama);
        this.hargaSatuan=harga;
        this.jumlahStok=0;
    }
    public BarangMusik(String kode, String nama, double harga, int stok){
        this(kode, nama, harga);
        this.jumlahStok=stok;
    }
    
    
    void ubahHarga(double hargaBaru) {
        if(hargaBaru>=0){
            this.hargaSatuan=hargaBaru;
        }else{
            System.out.println("Harga tidak valid.");
        }
    }
    
    void tambahStok(int jumlah) {
        if(jumlah>0){
            this.jumlahStok+=jumlah;
        }else{
            System.out.println("Jumlah stok yang ditambahkan harus positif.");
        }
    }

    void tampilInfo() {
        System.out.println("Alat musik "+this.namaAlat+" | Kode: "+this.kodeBarang+" | Harga: Rp "+this.hargaSatuan+" | Stok: "+this.jumlahStok+" unit");
    }
}