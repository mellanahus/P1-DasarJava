/* percobaan untuk membaca masukan dari keyboard
menggunakan kelas Scanner
 */

import java.util.Scanner;
public class T_InputScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? :");
        String name = input.nextLine();
        System.out.println("My name is "+ name);
    }
}
