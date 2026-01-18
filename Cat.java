public class Cat {
    private String nickname;

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Кот: " + this.nickname;
    }

    public void meow() {
        System.out.println(this.nickname + ": мяу!");
    }

    public void meow(int n) {
        System.out.println(this.nickname + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print("мяу");
            if (i < n - 1) {
                System.out.print("-");
            }
        }
        System.out.println("!");
    }
    public static void test() {
        Cat cat = new Cat("Барсик");

        System.out.println(cat);
        cat.meow();
        cat.meow(3);
    }
}
