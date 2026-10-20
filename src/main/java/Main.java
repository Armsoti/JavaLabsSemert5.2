import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Введіть кількість працівників: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("\nВведення даних працівника #" + (i + 1) + ":");

            System.out.print("Ім'я: ");
            String name = scanner.nextLine();

            System.out.print("Посада: ");
            String position = scanner.nextLine();

            System.out.print("Зарплата: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees.add(new Employee(name, position, salary));
        }

        System.out.println("\nСписок усіх створених працівників");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        scanner.close();
    }
}