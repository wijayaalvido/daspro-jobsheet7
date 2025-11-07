import java.util.Scanner;
public class TarifParkir05 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jenis, durasi;
    int total = 0;

    do {
        System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor) atau ketik 0 untuk keluar: ");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {

        System.out.print("Masukkan durasi jam parkir (dalam jam): ");
        durasi = sc.nextInt();

        if (durasi > 5) {
            total += 12500;
        
        } else {
            if (jenis == 1) {
            total += durasi*3000;

        }else if (jenis == 2)
            total += durasi*2000;
        }
        System.out.println("Total tarif parkir: Rp " + total);
        } else if (jenis == 0) {
            System.out.println("Terima kasih telah menggunakan layanan parkir kami.");
            break;
        } else {
            System.out.println("Jenis kendaraan tidak valid. Silakan masukkan 1 untuk Mobil, 2 untuk Motor, atau 0 untuk keluar.");
        }
    } while (true);

    sc.close();
    }
}