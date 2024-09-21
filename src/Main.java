import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance; // первоначальный баланс
        int added_sum; // сумма пополнения
        int bonus; // количество бонусных рублей
        int final_sum; // итоговый баланс

        Scanner in = new Scanner(System.in);
        System.out.print("Изначальный баланс: ");
        balance = in.nextInt();

        System.out.print("Сумма пополнения: ");
        added_sum = in.nextInt();

        if (added_sum >= 1000) {
            bonus = added_sum / 100;
        } 
        else {
            bonus = 0;
        }

        final_sum = balance + added_sum + bonus;
        System.out.print("Итоговый баланс: " + final_sum);
        // Также можно обойтись и без переменной "final_sum", залив сумму в скобочки в последней кодовой строке,
        // чтобы это выглядело так: System.out.print("Итоговый баланс: " + (balance + added_sum + bonus));
    }
}
