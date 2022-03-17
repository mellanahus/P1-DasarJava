/* percobaan mengkonversi nilai masukan dari keyboard
ke tipe tertentu menggunakan method bawaan kelas Scanner
 */

import java.io.IOException;
import java.util.Scanner;

public class V_InputTyperScannerB {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String name = input.nextLine();
        System.out.print("Masukkan umur : ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan : ");
        double height = input.nextDouble();
        System.out.print("Sudah menikah (true/false) : ");
        boolean married = input.nextBoolean();
        System.out.println("Nama : "+name);
        System.out.println("Umur : "+age);
        System.out.println("Tinggi Badan : "+height);
        System.out.println("Sudah Menikah : " +married);
    }
}
