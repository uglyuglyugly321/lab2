public class Name2 {
    private String lastName;   // Фамилия
    private String firstName;  // Имя
    private String middleName; // Отчество

    public Name2(String lastName, String firstName, String middleName) {
        this.lastName = lastName != null && !lastName.isEmpty() ? lastName : null;
        this.firstName = firstName != null && !firstName.isEmpty() ? firstName : null;
        this.middleName = middleName != null && !middleName.isEmpty() ? middleName : null;
    }

    public Name2(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public Name2(String firstName) {
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

    public void setMiddleName(String middleName) {
        if (middleName != null && !middleName.isEmpty()) {
            this.middleName = middleName;
        }
    }
    public static void test() {
        System.out.println("Имена:");

        Name2 name1 = new Name2("Клеопатра");
        Name2 name2 = new Name2("Пушкин", "Александр", "Сергеевич");
        Name2 name3 = new Name2("Маяковский", "Владимир");
        Name2 name4 = new Name2("Бонифатьевич", "Христофор");

        System.out.println("1. " + name1);
        System.out.println("2. " + name2);
        System.out.println("3. " + name3);
        System.out.println("4. " + name4);
    }
}