import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do{
            perulangan();
            Scanner input = new Scanner(System.in);
            System.out.print("\nApakah Program Mau diulang? [Y/N] : ");
            String statusiki = input.nextLine();
            if(statusiki.equals("Y")){
                i = 1;
            } else {
                i = 2;
                System.out.println("Terima Kasih");
            }
        } 
        while (i <= 1);
    }
    
    static void perulangan() {
        Scanner inputanperulangan = new Scanner(System.in);
        System.out.print("Masukkan Nilai X : ");
        int nilaix = inputanperulangan.nextInt();
        int status = nilaix % 2;
        if (nilaix == 0) {
            soal_c();
        } else if (nilaix > 0) {
            soal_a();
            if (status == 0) {
                soal_d();
            } else {
                System.out.println("Soal E Konversi Waktu");
                System.out.print("Masukkan Nilai konversi ke waktu : ");
                int nilainya = inputanperulangan.nextInt();
                soal_e(nilainya);
            }
        } else if (nilaix < 0) {
            soal_b(14);
            if (status == 0) {
                soal_d();
            } else {
                System.out.println("Soal E Konversi Waktu");
                System.out.print("Masukkan Nilai konversi ke waktu : ");
                int nilainya = inputanperulangan.nextInt();
                soal_e(nilainya);
            }
            soal_f();
        }
    }
    
    static void soal_a() {
        System.out.println("Soal A Mencari Umur Sinta");
        double sinta;
        // sinta = syifa + 10 -> syifa = sinta - 10;
        // syifa = amin - 3 -> amin = syifa + 3 -> amin = sinta - 7;
        // sinta + syifa + amin = 60 -> sinta + sinta - 10 + sinta - 7 = 60 -> 3sinta = 60 + 17
        sinta = (60.0 + 17.0) / 3.0;
        System.out.println("Umur sinta adalah "+sinta+" Tahun\n");
    }

    static void soal_b(double d) {
        System.out.println("Soal B Mencari Total Keliling");
        double diameter1 = d;
        double diameter2 = d / 2;
        double total_keliling = (3.14 * diameter1) + (2 * (3.14 * diameter2));
        System.out.println("Hasil total Keliling Adalah "+total_keliling+" cm\n");
    }

    static void soal_c() {
        System.out.println("Soal C Mencari Diameter");
        double jarak, rotasi, d;
        jarak = 1000.0;
        rotasi = 510.0;
        // Jarak = rotasi * keliling -> jarak = rotasi * 3.14 * d;
        d = rotasi * 3.14 / jarak;
        System.out.println("Diamaternya adalah "+d+" m\n");
    }

    static void soal_d() {
        System.out.println("Soal D Mencari Total Luas");
        double diamater = 12.0;
        double sisi = 1.5;
        double luaspersegi = sisi * sisi;
        double luas_lingkaran = (3.14 * (diamater / 2));
        double total_luas = luas_lingkaran - luaspersegi;
        System.out.println("Total Luas Adalah "+total_luas+" m2");
    }
    
    static void soal_e(int x) {
        int waktu, menit, detik, jam, menitsisa;
        waktu = x;
        if (waktu >= 0 && waktu < 60) {
            System.out.println("0 Jam 0 Menit " + waktu + " Detik");
        } else if (waktu >= 60 && waktu < 3600) {
            menit = waktu / 60;
            detik = waktu % 60;
            System.out.println("0 Jam " + menit + " Menit " + detik + " Detik");
        } else if (waktu >= 3600) {
            jam = waktu / 3600;
            menitsisa = waktu % 3600;
            menit = menitsisa / 60;
            detik = menitsisa % 60;
            System.out.println(jam + " Jam " + menit + " Menit " + detik + " Detik");
        }
    }
    
    static void soal_f() {
        System.out.println("\nSoal F Mencari saluran TV");
        Scanner soal_f = new Scanner(System.in);
        System.out.print("Masukkan data [A-F] : ");
        String data = soal_f.nextLine();
        if (data.equals("A") || data.equals("a")) {
            System.out.println("A = TVRI");
        } else if (data.equals("B") || data.equals("b")) {
            System.out.println("B = RCTI");
        } else if (data.equals("C") || data.equals("c")) {
            System.out.println("C = SCTV");
        } else if (data.equals("D") || data.equals("d")) {
            System.out.println("D = ANTV");
        } else if (data.equals("E") || data.equals("e")) {
            System.out.println("E = TRANSTV");
        } else if (data.equals("F") || data.equals("f")) {
            System.out.println("F = METROTV");
        } else {
            System.out.println("Data Yang Anda Masukkan Salah");
        }
    }
}