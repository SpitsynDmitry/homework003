public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear > 2014) {System.out.println("Установить версию приложения для Android по ссылке");}
        if (clientOS == 0 && clientDeviceYear > 2014) {System.out.println("Установить  версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {System.out.println("Установить  облегченную приложения для Android по ссылке");}
        if (clientOS == 0 && clientDeviceYear < 2015) {System.out.println("Установить облегченную версию приложения для iOS по ссылке");}



    }
}