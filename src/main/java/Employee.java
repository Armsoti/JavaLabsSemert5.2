import java.util.Objects;
/**
 * Клас, що описує сутність працівника підприємства.
 */
public class Employee {
    private String name;
    private String position;
    private double salary;
    private int age;

    /**
     * Конструктор для ініціалізації об'єкта Employee з перевіркою параметрів.
     *
     * @param name     ім'я працівника (не пусте)
     * @param position посада (не пуста)
     * @param salary   зарплата (більше 0)
     * @param age      вік працівника (від 18 до 70)
     */

    public Employee(String name, String position, double salary, int age) {
        setName(name);
        setPosition(position);
        setSalary(salary);
        setAge(age);
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Посада не може бути порожньою!");
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
        return "Employee{name='" + name + "', position='" + position + "', salary=" + salary + ", age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, age);
    }
}