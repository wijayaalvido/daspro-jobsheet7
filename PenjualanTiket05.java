import java.util.Scanner;
public class PenjualanTiket05 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tiket;
    double hargaTiket;
    String namaPembeli;

    do {
        System.out.print("Masukkan nama pembeli (ketik 'batal' untuk keluar): ");
        namaPembeli = sc.nextLine();

        if (namaPembeli.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
        }

        hargaTiket = 50000;

        System.out.print("Masukkan jumlah tiket yang dibeli : ");
        tiket = sc.nextInt();

        if (tiket <= 0) {
            System.out.println("tiket tidak valid. Masukkan tiket yang valid lebih dari 0.");
            continue;
        }

        if (tiket > 10) {
          hargaTiket *= 0.85;
          System.out.println("Selamat anda mendapatkan diskon 15% karena membeli lebih dari 10 tiket.");
        }
            
        else if (tiket > 4) {
          hargaTiket *= 0.9;
          System.out.println("Selamat anda mendapatkan diskon 10% karena membeli lebih dari 4 tiket.");
        }

        double totalHarga = tiket * hargaTiket;
        System.out.println("Total harga untuk " + namaPembeli + " adalah: Rp " + (int) totalHarga);
        sc.nextLine();

    } while (true);
    
    System.out.println("Semua transaksi telah selesai.");
    sc.close(); 
    }
} 
