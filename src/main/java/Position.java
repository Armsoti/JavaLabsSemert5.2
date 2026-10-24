/**
 * Перерахування посад працівників підприємства.
 */
public enum Position {
    DEVELOPER("Розробник"),
    QA("Тестувальник"),
    MANAGER("Менеджер"),
    DESIGNER("Дизайнер");

    private final String title;

    Position(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}