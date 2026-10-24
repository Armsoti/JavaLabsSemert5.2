import java.util.Objects;

/**
 * Клас, що описує сутність працівника підприємства.
 */
public class Employee {
    private static int counter = 0;

    private String name;
    private Position position;
    private double salary;
    private int age;

    /**
     * Конструктор для ініціалізації об'єкта Employee з перевіркою параметрів.
     *
     * @param name     ім'я працівника (не пусте)
     * @param position посада (значення з enum Position)
     * @param salary   зарплата (більше 0)
     * @param age      вік працівника (від 18 до 70)
     */
    public Employee(String name, Position position, double salary, int age) {
        setName(name);
        setPosition(position);
        setSalary(salary);
        setAge(age);
        counter++;
    }

    /**
     * Конструктор копіювання для створення незалежного дубліката об'єкта.
     *
     * @param other об'єкт Employee, дані якого копіюються
     */
    public Employee(Employee other) {
        if (other == null) {
            throw new IllegalArgumentException("Об'єкт для копіювання не може бути null!");
        }
        this.name = other.name;
        this.position = other.position;
        this.salary = other.salary;
        this.age = other.age;
        counter++;
    }

    /**
     * Статичний метод для отримання загальної кількості створених працівників.
     *
     * @return кількість створених об'єктів Employee
     */
    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Ім'я працівника не може бути порожнім!");
        }
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Посада обов'язково повинна бути вказана!");
        }
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Зарплата повинна бути строго більшою за нуль!");
        }
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 70) {
            throw new IllegalArgumentException("Вік працівника повинен бути від 18 до 70 років!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position=" + position + ", salary=" + salary + ", age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                age == employee.age &&
                Objects.equals(name, employee.name) &&
                position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, age);
    }
}