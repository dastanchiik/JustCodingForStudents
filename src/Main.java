import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        switch (str){
            case "January":
                System.out.println("Январь");
                break;
            case "February":
                System.out.println("Февраль");
                break;
            default:
                System.out.println("Мындай Ай Жок");
        }
    }
}