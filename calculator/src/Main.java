import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int a, b;
        char ch;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayı: ");
        a = input.nextInt();

        System.out.print("İkinci Sayı: ");
        b = input.nextInt();

        System.out.print("İşlem Karakteri: ");
        ch = input.next().charAt(0);

        System.out.print(ch);

        switch (ch) {
            case '+':
                System.out.println("\nToplam: " + (a + b));
                break;
            case '-':
                System.out.println("\nÇıkarım: " + (a - b));
                break;
            case '*':
                System.out.println("\nÇarpım: " + (a * b));
                break;
            case '/':
                System.out.println("\nBölüm: " + (a / b));
                break;
            default:
                System.out.println("\nHatalı giriş yaptınız!Dört işlem karakterinden birini giriniz.");
                break;

        }
    }
}
