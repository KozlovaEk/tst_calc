import java.util.Scanner;
import java.io.File;

class calc{
    public static void main(String[] args) {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);
        String a = sc.next();
        String op = sc.next();
        String b = sc.next();

        try {
            char[] aArr = a.toCharArray();
            char[] bArr = b.toCharArray();
            for (int i=0; i< aArr.length;i++){
                // System.out.println(i+" "+String.valueOf(aArr[i]).equals("."));
                if (!Character.isDigit(aArr[i]) && !(String.valueOf(aArr[i]).equals(".") || String.valueOf(aArr[i]).equals("-"))) {
                    throw new Exception("Error! Not number");
                }
            }
            for (int i=0; i< bArr.length;i++){
                if (!Character.isDigit(bArr[i]) && !(String.valueOf(bArr[i]).equals(".") || String.valueOf(bArr[i]).equals("-"))) {
                    throw new Exception("Error! Not number");
                }
            }
            if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                throw new Exception("Operation Error!");
            }
            if (op.equals("/") && b.equals("0")) {
                throw new Exception("Error! Division by zero");
            }
            double a1 = Double.valueOf(a);
            double b1 = Double.valueOf(b);
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