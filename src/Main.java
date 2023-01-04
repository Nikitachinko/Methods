import java.time.LocalDate;

public  class Main {

    public static void main(String[] args) {
        printIsLeapYear(2024);
        reccomendApplicationVersion(0, 2022);
        calculateDeliveryDays(50);
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный ");
        } else {
            System.out.println(year + " не является високосный ");
        }
    }

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void reccomendApplicationVersion(int clientOs, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print(" Lite ");
        }
        System.out.print(" версию для ");
        if (clientOs == 0) {
            System.out.println(" iOS ");
        } else {
            System.out.println(" Android ");
        }
    }

    public static void printSetSystem(int clientDeviceYear, int clientDevice) {
        String version = "";
        if (clientDeviceYear < 2023) {
            version = "облегченную";
        }
        String device = "";
        if (clientDevice == 0) {
            device = "iOS";
        } else if (clientDevice == 1) {
            device = "Android";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке", version, device);
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    public static void calculateDeliveryDays(int deliveryDistance) {
            if(deliveryDistance<20){
            System.out.println("Потребуется дней: 1");
        }else if (deliveryDistance>=20&&deliveryDistance<60){
                System.out.println("Потребуется 2 дня ");
            } else if (deliveryDistance>=60&&deliveryDistance<100) {
                System.out.println(" Потребуется 3 дня ");
            } else if (deliveryDistance>=100) {
                System.out.println("Доставки нет");
            }
    }


}


