import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter First Name: ");
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        person.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        person.setLastName(scanner.nextLine());

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        person.setAge(age);

        scanner.nextLine(); 
        System.out.print("Enter Birthday (yyyy-MM-dd): ");
        person.setBirthday(scanner.nextLine());

        System.out.print("Enter Address: ");
        person.setAddress(scanner.nextLine());
        System.out.println();
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBirthday());
        System.out.println("Address: " + person.getAddress());


    }
}
