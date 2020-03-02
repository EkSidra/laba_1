package BINAR;

public class Binar {
    public static String toBinar(String str) {
        String _number;
        try {
            long numb = Long.parseLong(str);
            _number = Long.toBinaryString(numb);
        }
        catch(NumberFormatException ex)
        {
            _number="Ошибка ввода";
        }
        return _number;
    }
}
