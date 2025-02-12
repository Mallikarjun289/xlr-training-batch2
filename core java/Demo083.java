import java.util.Scanner;
public class Demo083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); 
        ch = Character.toLowerCase(ch);
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println(ch + " is not an alphabet.");
                }
            }
        }
    }