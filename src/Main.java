public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
            int iOS = 0;
            int android = 1;
            int clientOS = 1;
            if (clientOS == iOS) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == android) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
}