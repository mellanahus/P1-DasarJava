// percobaan mengkonversi tipe data

public class Q_CastingPromotion {
    public static void main(String[] args) {

        long varLong = 1000000L;
        int varInt = 23456;
        varInt = (int) varLong;;
        varLong = varInt;
        System.out.println("Nilai varLong = "+varLong);
        System.out.println("Nilai varInt = "+varInt);
        char varChar = 'a';
        varInt = (int) varChar;
        System.out.println("Nilai varInt ('a') = " + varInt);
        varChar = (char) (varInt+1);
        System.out.println("Nilai varChar = "+varChar);
        byte varByte = 127;
        varInt = varByte;
        System.out.println("Nilai varInt(127) = "+varInt);
        short varShort = (short) varInt;
        System.out.println("Nilai varShort = "+varShort);
        varShort = varByte;
        System.out.println("Nilai varShort = "+varShort);
        double varDouble = 3.145256718992022;
        float varFloat = (float) varDouble;
        System.out.println("Nilai varDouble = "+varDouble);
        System.out.println("Nilai varFloat = "+varFloat);
    }
}
