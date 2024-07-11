package demo;

public class StringIsNumeric {
    public static void main(String[] args) {
        String s = "1234.89";
        boolean numeric = true;
        try {
            Double d = Double.parseDouble(s);
        }
        catch (NumberFormatException n)
        {
            numeric = false;
        }

        if(numeric) {
            System.out.println("numeric numbers - " + s);
        }
        else {
            System.out.println("not a numeric - " + s);
        }

    }
}
