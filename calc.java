import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

class calc{
    public static void main(String[] args) {
        File file = new File("test.txt");
        Scanner sc;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String a = sc.next();
        String op = sc.next();
        String b = sc.next();

        try {
            char[] aArr = a.toCharArray();
            char[] bArr = b.toCharArray();
            for (char c : aArr) {
                // System.out.println(i+" "+String.valueOf(aArr[i]).equals("."));
                if (!Character.isDigit(c) && !(String.valueOf(c).equals(".") || String.valueOf(c).equals("-"))) {
                    throw new Exception("Error! Not number");
                }
            }
            for (char c : bArr) {
                if (!Character.isDigit(c) && !(String.valueOf(c).equals(".") || String.valueOf(c).equals("-"))) {
                    throw new Exception("Error! Not number");
                }
            }
            if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                throw new Exception("Operation Error!");
            }
            if (op.equals("/") && b.equals("0")) {
                throw new Exception("Error! Division by zero");
            }
            double a1 = Double.parseDouble(a);
            double b1 = Double.parseDouble(b);
            if (op.equals("+")) {
                System.out.println(a1 + b1);
            }
            if (op.equals("-")) {
                System.out.println(a1 - b1);
            }
            if (op.equals("*")) {
                System.out.println(a1 * b1);
            }
            if (op.equals("/")) {
                System.out.println(a1 / b1);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}