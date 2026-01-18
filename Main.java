import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Меню ===");
            System.out.println("1 — Задание 1 (Имена)");
            System.out.println("2 — Задание 2 (Человек)");
            System.out.println("3 — Задание 3 (Города)");
            System.out.println("4 — Задание 4 (Имена 2)");
            System.out.println("5 — Задание 5 (Кот)");

            System.out.println("0 — Выход");
            System.out.print("Выберите пункт: ");

            choice = sc.nextInt();
            sc.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    Name.test();
                    break;
                case 2:
                    Human.test();
                    break;
                case 3:
                    City.test();
                    break;
                case 4:
                    Name2.test();
                    break;
                case 5:
                    Cat.test();
                    break;
                case 0:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный ввод!");
            }
        } while (choice != 0);
    }
}