public class Main {
    public static void main(String[] args) {

        //вход
        int initialInvoiceAmount = 100;
        int depositAmount = 1500;
        //логика
        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = initialInvoiceAmount + depositAmount + bonus;
        System.out.println("Ваш итоговый счёт: " + totalAmount);
        System.out.println("Ваше количество бонусных рублей: " + bonus);
    }
}
