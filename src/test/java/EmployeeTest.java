import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void shouldThrowExceptionWhenInvalidValueInSetter() {
        Employee emp = new Employee("Іван", "Розробник", 40000.0, 25);

        // Перевіряємо, що при від'ємній зарплаті сеттер кидає IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            emp.setSalary(-500.0);
        });
    }

    @Test
    void shouldThrowExceptionWhenInvalidConstructorData() {
        // Перевіряємо, що не можна створити працівника з пустим ім'ям
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee("", "Тестувальник", 30000.0, 22);
        });
    }

    @Test
    void shouldThrowExceptionWhenAgeIsInvalid() {
        // Перевіряємо валідацію віку менше 18 років
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee("Олег", "Стажер", 15000.0, 16);
        });
    }
}