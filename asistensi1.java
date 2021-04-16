import java.util.Scanner;
public class asistensi1 {
    public static void main(String[] args) {
        int i = 1;
        do {
            perulangan();
            Scanner input = new Scanner(System.in);
            System.out.print("\nApakah Program Mau diulang? [Y/N] : ");
            String statusiki = input.nextLine();
            if (statusiki.equals("Y")) {
                i = 0;
                System.out.println("Program Berulang" +i);
            } else if(statusiki.equals("N")){
                i = 2;
                System.out.println("Terima Kasih" +i);
            } else {
                i = 1;
                System.out.println("Inputan Yang anda Masukkan salah" + i);
            }
        } while (i <= 1);
    }
    
    
    static void perulangan() {
        Scanner inputanperulangan = new Scanner(System.in);
        System.out.print("Masukkan Nilai X : ");
        int nilaix = inputanperulangan.nextInt();
        int status = nilaix % 2;
        if (nilaix == 0) {
            System.out.println("Nilai 0");
        } else if (nilaix > 0) {
            System.out.println("Ini Nilai Positif");
            if (status == 0) {
                System.out.println("Ini Bilangan Positif Genap");
            } else {
                System.out.println("Ini Bilangan Posisif Ganjil");
            }
        } else if (nilaix < 0) {
            System.out.println("Ini Bilangan Negatif");
            if (status == 0) {
                System.out.println("Ini Bilangan Bilangan Negatif Genap");
            } else {
                System.out.println("Ini Bilangan Bilangan Negatif Ganjil");
            }
        }
    }
}
