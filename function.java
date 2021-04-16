import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        perulangan();
    }

    static void perulangan() {
        Scanner inputanperulangan = new Scanner(System.in);
        System.out.print("Masukkan Nilai X : ");
        int nilaix = inputanperulangan.nextInt();
        int status = nilaix % 2;

// Bilangan 0
// Soal C

// Bilagan Positif
// Soal A D/E

// Bilangan Negatif
// Soal B F D/E 

        if (nilaix == 0) {
            // soal_c();
        } else if (nilaix > 0) {
            // soal_a();
            if (status == 0) {
                // soal_d();
            } else {
                // System.out.println("Soal E Konversi Waktu");
                // System.out.print("Masukkan Nilai konversi ke waktu : ");
                // int nilainya = inputanperulangan.nextInt();
                // soal_e(nilainya);
            }
        } else if (nilaix < 0) {
            // soal_b(14);
            if (status == 0) {
                // soal_d();
            } else {
                System.out.println("Soal E Konversi Waktu");
                System.out.print("Masukkan Nilai konversi ke waktu : ");
                int nilainya = inputanperulangan.nextInt();
                soal_e(nilainya);
            }
            soal_f();
        }
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
        // if(data=="A")
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


