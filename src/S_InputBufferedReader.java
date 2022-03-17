/* percobaan untuk membaca masukan
dari keyboard menggunakan kelas BufferedReader
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_InputBufferedReader {
    public static void main(String[] args) throws IOException {

        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        System.out.print("What is your name? :");
        String name = input.readLine();
        System.out.println("My name is "+name);
    }
}

