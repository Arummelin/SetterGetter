package SetterGetter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class Birthday {
    int hari;
    int bulan;
    int tahun;
    Birthday() {
        Scanner input = new Scanner(System.in);
        System.out.print("Tanggal Lahir (01-31) : ");
        this.hari = input.nextInt();
        System.out.print("Bulan Lahir (01-12) : ");
        this.bulan = input.nextInt();
        System.out.print("Tahun Lahir : ");
        this.tahun = input.nextInt();
    }
    void Count() {
        LocalDate lahir = LocalDate.of(this.tahun, this.bulan, this.hari);
        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(lahir, sekarang);
        this.hari = selisih.getDays();
        this.bulan = selisih.getMonths();
        this.tahun = selisih.getYears();
    }
    Integer Hari() {
        return this.hari;
    }
    Integer Bulan() {
        return this.bulan;
    }
    Integer Tahun() {
        return this.tahun;
    }

}

public class Arum {
    public static void main(String[] args) {
        String nama;
        System.out.println(" = = = Masukkan Data Dirimu = = = ");
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Lengkap : ");
        nama = input.nextLine();
        Birthday manusia = new Birthday();
        manusia.Count();
        System.out.println("\n\nHai " + nama + " !");
        System.out.println("Usiamu Saat Ini Adalah ");
        System.out.println(manusia.Tahun() + " Tahun");
        System.out.println(manusia.Bulan() + " Bulan");
        System.out.println(manusia.Hari() + " Hari");
    }
}
