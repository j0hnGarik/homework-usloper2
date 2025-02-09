public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("задача 2");
        int clientDeviceYear = 2013;
        int clientOS2 = 0;
        if (clientDeviceYear <= 2015 && clientOS2 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("задача 3");
        int year = 6880;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else
        System.out.println(year + " год не является високосным");
        System.out.println("задача 4");
        int deliveryDistance = 50;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("потребуется дней: " + (deliveryTime + 1));
        }
        if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("потребуется дней: " + deliveryTime + 2);
        }else {
            System.out.println("доставки нет");
        }
        System.out.println("задача 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("месяц принадлежит к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("месяц принадлжеит к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("месяц принадлежит к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("месяц принадлежит к осени");



        }

    }}