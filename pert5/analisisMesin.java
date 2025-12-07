import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] inventaris = new defaultMesin[5];
        // Isi array dengan objek mesinMotor
        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        // Isi array dengan objek mesinTraktor
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 4.5);
        // Isi array dengan objek mesinTraktorListrik
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70.0);
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80.0);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for (defaultMesin mesin : inventaris) {
            mesin.tampilInfo(); // Overriding aktif
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.printf("Performa: %.1f%n", mesin.nilaiPerforma()); // Overriding aktif
            System.out.println();
        }
        // Loop untuk menampilkan kategori dan performa

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin mesin : inventaris) {
            if (mesin instanceof mesinMotor) {
                ((mesinMotor) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        double maxPerforma = -1;
        String namaMesinTerbaik = "";

        for (defaultMesin mesin : inventaris) {
            double performa = mesin.nilaiPerforma();
            if (performa > maxPerforma) {
                maxPerforma = performa;
                namaMesinTerbaik = mesin.namaMesin;
            }
        }

        System.out.printf("%s → %.1f%n", namaMesinTerbaik, maxPerforma);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        List<defaultMesin> listMesin = new ArrayList<>(List.of(inventaris));
        listMesin.sort(Comparator.comparingDouble(defaultMesin::nilaiPerforma).reversed());
        for (int i = 0; i < Math.min(3, listMesin.size()); i++) {
            defaultMesin mesin = listMesin.get(i);
            System.out.printf("%d. %s → %.1f%n", (i + 1), mesin.namaMesin, mesin.nilaiPerforma());
        }
    }
}
