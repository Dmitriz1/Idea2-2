import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance; // первоначальный баланс
        int addedSum; // сумма пополнения
        int bonus; // количество бонусных рублей
        int finalSum; // итоговый баланс

        Scanner in = new Scanner(System.in);
        System.out.print("Изначальный баланс: ");
        balance = in.nextInt();

        System.out.print("Сумма пополнения: ");
        addedSum = in.nextInt();

        if (addedSum >= 1000) {
            bonus = addedSum / 100;
        } 
        else {
            bonus = 0;
        }

        finalSum = balance + addedSum + bonus;
        System.out.print("Итоговый баланс: " + finalSum);
        // Также можно обойтись и без переменной "finalSum", залив сумму в скобочки в последней кодовой строке,
        // чтобы это выглядело так: System.out.print("Итоговый баланс: " + (balance + addedSum + bonus));
    }
}
