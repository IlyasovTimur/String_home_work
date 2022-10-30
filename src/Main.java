public class Main {
    public static void main(String[] args) {
        System.out.println("String");
        task1();
        task2();
        task3();
    }

    private static void task3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович ";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich ";
        String bigName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + bigName);

    }

    private static void task1() {
        System.out.println("Задание 1");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
}