    import java.util.Scanner;
    public class Ekspedisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di layanan ekspedisi kami!");
        System.out.println("Masukkan Berat paket");
        double berat = scanner.nextDouble();
        System.out.println("Masukkan Jarak pengiriman (dalam km)");
        double jarak = scanner.nextDouble();
        double tarif = 4250; 
        double tarifs =6000; 

        System.out.println("masukkan tinggi paket");
        double tinggi = scanner.nextDouble();
        System.out.println("masukkan lebar paket");
        double lebar = scanner.nextDouble();
        System.out.println("masukkan panjang paket");
        double panjang = scanner.nextDouble();
        double volume = tinggi * lebar * panjang;

        System.out.println("jadi Berat paket adalah: " + berat + " kg");
        System.out.println("jadi Jarak pengiriman adalah: " + jarak + " km");
        System.out.println("jadi Volume paket adalah: " + volume + " cm3");
        
        double biaya;
        if (jarak >= 10) {
            biaya = tarifs * berat;
        } else {
            biaya = tarif * berat;
        }

        if (volume > 100) {
            biaya += 50000;
        }

        System.out.println("ongkos kirim anda adalah : " + biaya);
        scanner.close();
    }
}