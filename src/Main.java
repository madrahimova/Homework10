public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);

        System.out.printf("ФИО сотрудника — %s\n", fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);

        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s\n", fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";

        System.out.printf("Данные ФИО сотрудника — %s\n", fullName.replace("ё", "е"));
    }
}