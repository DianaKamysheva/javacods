
package Lab2;

public class Name {
    private String lastName;
    private String firstName;
    private String patronymic;

    //Конструктор для создания объекта Name с фамилией, именем и отчеством.
    public Name(String lastName, String firstName, String patronymic) {
        setLastName(lastName);
        setFirstName(firstName);
        setPatronymic(patronymic);
    }

    // Перегруженный конструктор с двумя параметрами
    public Name(String lastName, String firstName) {
        this(lastName, firstName, "");  // patronymic будет пустым
    }

    // Перегруженный конструктор с одним параметром
    public Name(String lastName) {
        this(lastName, null, null);  // firstName и patronymic будут null
    }

    //Метод задания фамилии
    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой или null."); // Защита от пустых значений
        }
        this.lastName = lastName;
    }

    //Метод задания имени
    public void setFirstName(String firstName) {
        if (firstName != null && firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым."); // Защита от пустого имени
        }
        this.firstName = firstName != null ? firstName : "";
    }

    //Метод задания отчества
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic != null ? patronymic : "";
    }

    @Override
    //Метод возвращает строковое представление объекта Name.
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (!lastName.isEmpty()) {
            sb.append(lastName);
        }

        if (!firstName.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(firstName);
        }

        if (!patronymic.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(patronymic);
        }

        return sb.toString();
    }
}