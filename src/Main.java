public class Main {
    public static void main(String[] args) {
        task12();
        task3();
        task4();
        task5();
    }

    public static void task12() {
        int iOS = 0;
        int android = 1;
        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientOS == iOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOS && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == android && clientDeviceYear <= 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOS == android && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int year = 2021;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void task4() {
        int deliveryDay = 0;
        int deliveryDistance =102;
        if (deliveryDistance <= 20) {
            int delivery = deliveryDay + 1;
            System.out.println("Потребуется дней: " + delivery);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            int delivery2 = deliveryDay + 2;
            System.out.println("Потребуется дней: " + delivery2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            int delivery3 = deliveryDay + 3;
            System.out.println("Потребуется дней: " + delivery3);
        } else {
            System.out.println("Свыше 100км доставки нет");
        }
    }
    //Напишите программу, которая определяет по номеру месяца в году,
    // к какому сезону этот месяц принадлежит. Например,
    // 1-й месяц (он же январь) принадлежит к сезону зима.
    //
    //Для написания программы используйте оператор switch.
    // Для обозначения номера месяца используйте переменную monthNumber = 12.
    //
    //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
    public static void task5(){
        byte monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("You use something not month");
        }
    }
}