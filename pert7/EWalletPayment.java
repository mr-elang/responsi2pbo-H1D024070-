public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoPengguna;
    private static final double TRANSACTION_FEE = 2000.0;

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldoAwal) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldoPengguna = saldoAwal;
    }

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal
    @Override
    public String processPayment() {
        double totalBiaya = this.nominalPembayaran + TRANSACTION_FEE;
        if (this.saldoPengguna >= totalBiaya) {
            this.saldoPengguna -= totalBiaya;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + this.namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return TRANSACTION_FEE;
    }

    @Override
    public double getBalance() {
        return this.saldoPengguna;
    }
}
