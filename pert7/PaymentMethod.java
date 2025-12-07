public interface PaymentMethod {

    // TODO: Tambahkan method abstract berikut:
    // - processPayment(): digunakan untuk memproses pembayaran
    // - getPaymentDetails(): mengembalikan informasi pembayaran
    // - getTransactionFee(): mengembalikan biaya transaksi
    // - getBalance(): mengembalikan saldo
    String processPayment();
    String getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}
