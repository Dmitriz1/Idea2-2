public class Main {
    public static void main(String[] args) {
        int balance = 100; // первоначальный баланс
        int addedSum = 1100; // сумма пополнения
        int bonus; // количество бонусных рублей
        int finalSum; // итоговый баланс

        if (addedSum >= 1000) {
            bonus = addedSum / 100;
        } else {
            bonus = 0;
        }

        finalSum = balance + addedSum + bonus;
        System.out.print("Итоговый баланс: " + finalSum);
    }
}
