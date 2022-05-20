public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear > 2014) {System.out.println("Установить версию приложения для Android по ссылке");}
        if (clientOS == 0 && clientDeviceYear > 2014) {System.out.println("Установить  версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {System.out.println("Установить  облегченную приложения для Android по ссылке");}
        if (clientOS == 0 && clientDeviceYear < 2015) {System.out.println("Установить облегченную версию приложения для iOS по ссылке");}

        // задача 3
        int year = 2400;
        int year1 = year % 4;
        int year2 = year % 100;
        int year3 = year % 400;
        {System.out.println(year2);}
        if (year1 == 0 && year2 !=0)  {System.out.println("Год является високосный");
        } else if (year3 == 0) {System.out.println("Год является високосный");}

        // задача 4
        int deliveryDistance = 95;
        int freeDelivery = 20;
        double chargeDelivery = 40;
        double time = Math.ceil(1 + ((deliveryDistance - freeDelivery) / chargeDelivery));
        {System.out.println("Потребуется " + time + " дней");}

        // задача 5
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;

        }


    }
}