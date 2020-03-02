package sample;

public class Binar {
    public static String toBinary(String str) {
        String number;
        try {
            long numb = Long.parseLong(str);
            number = Long.toBinaryString(numb);
        }
        catch(NumberFormatException ex)
        {
            number="Ошибка ввода";
        }
        return number;
    }
}
