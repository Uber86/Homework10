public class Main {
    public static void main(String[] args) {

        // Задание №1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();

        // Задание №2
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);
        // ну или  чтоб не создавать новую переменную System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println();


        // Задание №3
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1.replace('ё' , 'е'));





    }
}