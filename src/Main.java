public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
    }
    public static void task0 () {
        String phone = "919-999 99 99";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException(" Номер телефона слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException(" номер телефона слишком коротки");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException(" не корректный ввод данных ");
        }
        System.out.println(" phone = " + phone);
        String expectedPhone = "79199999999";
        if (phone.equals(expectedPhone)) {
            System.out.println(" успех ");
        } else {
            System.out.println(" неудача ");
        }
    }

    public static void task1 (){
        System.out.println( " задание 1");
        String firstName = "Artem";
        String midleName = "Artemiev";
        String lastname = "Artemonov";
        String fullName = lastname + " " + firstName + " " + midleName;
        System.out.println(" ФИО сотрудника " + fullName);
    }
    public static void task2 (){
        System.out.println( " задание 2");
        String firstName = "Artem";
        String midleName = "Artemiev";
        String lastname = "Artemonov";
        String fullName = lastname + " " + firstName + " " + midleName;
        System.out.println(" ФИО сотрудника " + fullName.toUpperCase());
    }
    public static void task3 (){
        System.out.println( " задание 3");
        String firstName = "Семён";
        String midleName = "Семёнович";
        String lastname = "Иванов";
        firstName = firstName.replace("ё", "е");
        lastname = lastname.replace("ё", "е");
        String fullName = lastname + " " + firstName + " " + midleName;
        System.out.println(" ФИО сотрудника " + fullName);

    }



}


