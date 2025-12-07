public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi

        double saldoAwal = 150000.0;
        double nominalTransaksi = 50000.0;
        String namaEWallet = "OVO";

        EWalletPayment payment = new EWalletPayment(namaEWallet, nominalTransaksi, saldoAwal);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.printf("Saldo awal: %.0f%n", payment.getBalance());
        System.out.printf("Memproses pembayaran sebesar %.0f (termasuk fee %.0f)...%n", nominalTransaksi, payment.getTransactionFee());

        String status = payment.processPayment();
        System.out.println(status);

        if (status.equals("Pembayaran berhasil!")) {
            System.out.printf("Sisa saldo: %.0f%n", payment.getBalance());
            System.out.println("Detail Transaksi: " + payment.getPaymentDetails());
            System.out.printf("Biaya Transaksi: %.0f%n", payment.getTransactionFee());
        } else {
            System.out.println("Detail Transaksi: Proses dibatalkan karena saldo tidak cukup.");
        }
    }
}
