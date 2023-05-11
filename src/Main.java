import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }
    public static void divideYear (int year) {
        boolean leapYear = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        if (leapYear) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }
    public static void task1() {
        System.out.println("Задача 1");
        Scanner year = new Scanner (System.in);
        System.out.println("Введите год и программа скажет високосный-ли он:");
        int yearIn = year.nextInt();
        divideYear(yearIn);
    }
    public static void deviceApp (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean androidLite = (clientOS == 1 && clientDeviceYear < currentYear - 15);
        boolean iOSLite = (clientOS == 0 && clientDeviceYear < currentYear - 15);
        boolean iOSUsual = (clientOS == 0 && clientDeviceYear >= currentYear - 15);
        boolean androidUsual = (clientOS == 1 && clientDeviceYear >= currentYear - 15);
        if (androidLite) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (iOSLite) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (iOSUsual) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (androidUsual) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Неизвестная оперативная система.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2018;
        deviceApp(clientOS, clientDeviceYear);
    }
    public static int deliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = deliveryTime + 1;
        } else if (deliveryDistance < 60) {
            deliveryTime = deliveryTime + 2;
        } else if (deliveryDistance < 100) {
            deliveryTime = deliveryTime + 3;
        } else {
            System.out.println("Доставка на такое расстояние не осуществляется.");
        }
        return deliveryTime;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int totalTime = deliveryTime(deliveryDistance);
        System.out.println("Время доставки карты - " + totalTime + " дня.");
    }

}