import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai = 5;

        System.out.print("Masukkan nilai yang anda mau = ");
        nilai = sc.nextInt();

        switch (nilai % 2) {
        case 0:
            System.out.print(nilai + " adalah nilai genap");
            break;
        case 1:
            System.out.print(nilai + " adalah nilai ganjil");
            break;
        default:
            System.out.print("Nilai yang anda masukkan salah, silahkan cobalagi");
            break;
        }
    }
}
