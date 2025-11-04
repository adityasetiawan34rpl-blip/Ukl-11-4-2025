import java.util.Scanner;
public class volumeTabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung (dalam cm): ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung (dalam cm): ");
        double tinggi = scanner.nextDouble();

        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;

        System.out.printf("Volume tabung adalah: %.2f cm3%n", volume);
    }
}