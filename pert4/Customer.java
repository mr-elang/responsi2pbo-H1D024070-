class Customer {
    // TODO: Buatkan atribut
    protected String namaLengkap;
    protected String nomorIdentitas;
    protected int totalBelanja;

    // TODO: Sediakan constructor
    public Customer(String namaLengkap, String nomorIdentitas, int totalBelanja){
        this.namaLengkap=namaLengkap;
        this.nomorIdentitas=nomorIdentitas;
        this.totalBelanja=totalBelanja;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: "+namaLengkap+" | ID: "+nomorIdentitas+" | Total Belanja: Rp "+totalBelanja);
    }
}
