public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("  Задание 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
          //Задание 2
        System.out.println("  Задание 2");

        int clientDeviceYear = 2018;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 3
        System.out.println("  Задание 3");

        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
                System.out.println(year + " Год не является високосным");
        }

        //Задание 4
        System.out.println("  Задание 4");

        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
           } if (deliveryDistance > 60) {
            deliveryDay++;
        }
        System.out.println("Потребуется дней: " + deliveryDay);

        //Задача 4.Еще 1 вариант решения, в котором учтено расстояние больше 100
        System.out.println("Задача 4.1");

        int deliveryTime = 1;
        int deliveryTime1 = deliveryTime + 1;
        int deliveryTime2 = deliveryTime1 + 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + deliveryTime1);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryTime2);
        } else {
            System.out.println("Потребуется дней более: " + deliveryTime2);
        }


        //Задание 5
        System.out.println("  Задание 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимушка-зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна красна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето яркой зеленью одето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень золотая");
                break;
            default:
                System.out.println("нет такого месяца" + monthNumber);
        }

    }
}