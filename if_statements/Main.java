package if_statements;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

    int age;
    Scanner scanner = new Scanner(System.in);
    age = scanner.nextInt();

    if(age>=75) {
        System.out.println("Ok, boomer!");
    }
    else if(age>=18) {
        System.out.println("You are an adult!");
    }
    else if(age>13) {
        System.out.println("You are a teenager!");
    }
    else {
        System.out.println("You are not an adult!");
    }
    scanner.close();
}
}
