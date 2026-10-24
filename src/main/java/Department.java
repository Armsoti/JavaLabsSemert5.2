import java.util.ArrayList;

/**
 * Клас, що описує підрозділ/відділ компанії та демонструє принцип агрегації.
 */
public class Department {
    private String departmentName;
    private Employee manager;
    private ArrayList<Employee> staff;

    /**
     * Конструктор для ініціалізації відділу.
     *
     * @param departmentName назва відділу
     * @param manager        керівник відділу (об'єкт класу Employee)
     */
    public Department(String departmentName, Employee manager) {
        setDepartmentName(departmentName);
        setManager(manager);
        this.staff = new ArrayList<Employee>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        if (departmentName == null || departmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Назва відділу не може бути порожньою!");
        }
        this.departmentName = departmentName;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        if (manager == null) {
            throw new IllegalArgumentException("Керівник відділу не може бути null!");
        }
        this.manager = manager;
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    /**
     * Додає співробітника до штату відділу.
     *
     * @param emp співробітник для додавання
     */
    public void addEmployee(Employee emp) {
        if (emp == null) {
            throw new IllegalArgumentException("Неможливо додати порожній об'єкт працівника!");
        }
        staff.add(emp);
    }

    @Override
    public String toString() {
        String result = "Відділ: " + departmentName + "\n";
        result += "  Керівник: " + manager + "\n";
        result += "  Штат працівників (" + staff.size() + " осіб):\n";
        if (staff.isEmpty()) {
            result += "    [штат порожній]\n";
        } else {
            for (Employee emp : staff) {
                result += "    - " + emp + "\n";
            }
        }
        return result;
    }
}