// percobaan untuk format keluaran menggunakan objek formatter


import java.text.NumberFormat;
public class X_OutputNumberFormat {
    public static void main(String[] args) {

        double doubleVal = 1280.8 / 2.5;
        NumberFormat numberFormatter = NumberFormat.getNumberInstance();
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        String numberStr = numberFormatter.format(doubleVal);
        String currStr = currFormatter.format(doubleVal);
        String percentStr = percentFormatter.format(doubleVal);
        System.out.println("double 1280.8/2.5 nerformat number : " + numberStr);
        System.out.println("double 1280.8/2.5 nerformat currency : " + currStr);
        System.out.println("double 1280.8/2.5 nerformat percent : " + percentStr);
    }
}
