import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello, " + name);
        System.out.println("You are" + " " + age + " years old.");
        System.out.println("You gpa is:" + " " + gpa);

        scanner.close();


    }
}




