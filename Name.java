public class Name {
    private String lastName;   // Фамилия
    private String firstName;  // Имя
    private String middleName; // Отчество

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName != null && !lastName.isEmpty() ? lastName : null;
        this.firstName = firstName != null && !firstName.isEmpty() ? firstName : null;
        this.middleName = middleName != null && !middleName.isEmpty() ? middleName : null;
    }

    public Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public Name(String firstName) {
        this(null, firstName, null);
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setMiddleName(String middleName) {
        if (middleName != null && !middleName.isEmpty()) {
            this.middleName = middleName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (lastName != null) sb.append(lastName);
        if (firstName != null) {
            if (sb.length() > 0)
                sb.append(" ");
            sb.append(firstName);
        }
        if (middleName != null) {
            if (sb.length() > 0)
                sb.append(" ");
            sb.append(middleName);
        }
        return sb.toString();
    }

    public static void test(){
        System.out.println("Имена: ");

        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);

        System.out.println("1-ое имя: " + name1);
        System.out.println("2-ое имя: " + name2);
        System.out.println("3-ое имя: " + name3);

    }
}