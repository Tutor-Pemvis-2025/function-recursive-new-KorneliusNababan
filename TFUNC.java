//12S25013 kornelius Nababan
import java.util.*;
import java.lang.Math;
public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil;

        n = Integer.parseInt(input.nextLine());
        hasil = pertambahan(n);
        System.out.println("Bilangan yang dimasukkan : " + n);
        System.out.println("Hasil perhitungan rekursif : " + hasil);
    }
}
