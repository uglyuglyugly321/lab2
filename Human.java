public class Human {
    private Name name;   // Фамилия
    private int height;  // Имя
    private Human father;

    public Human(Name name, int height, Human father) {
        this.name = name;
        this.height = height;
        this.father = father;

    }
    public Name getName() {
        return name;
    }
    @Override
    public String toString() {
         if (name.getLastName() == null && father != null) {
             name.setLastName(father.getName().getLastName());
         }
         if ((name.getMiddleName() == null && father != null)) {
             name.setMiddleName(father.getName().getFirstName() + "ович");
         }

        return this.name + ", рост: " + this.height;
    }

    public static void test() {

        Name nameIvan = new Name("Чудов", "Иван", null);
        Name namePetr = new Name("Чудов", "Петр", null);
        Name nameBoris = new Name(null, "Борис", null);

        Human human1 = new Human(nameIvan, 152, null);
        Human human2 = new Human(namePetr, 167, human1);
        Human human3 = new Human(nameBoris, 189, human2);


        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
