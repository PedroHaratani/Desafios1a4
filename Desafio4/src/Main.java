import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();


        if(str.length()>1 && str.length()<=100) {
            if (str.length() % 2 == 0) {
                String str1 = str.substring(0, str.length() / 2);
                StringBuilder strBuilder = new StringBuilder(str1);
                str1 = strBuilder.reverse().toString();
                String str2 = str.substring(str.length() / 2, str.length());
                strBuilder = new StringBuilder(str2);
                str2 = strBuilder.reverse().toString();

                System.out.println(str1 + str2);
            }
        } else {
            System.out.println("Essa string não é válida");
        }
    }
}