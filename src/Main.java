import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance; // первоначальный баланс
        int AddedSum; // сумма пополнения
        int bonus; // количество бонусных рублей
        int FinalSum; // итоговый баланс

        Scanner in = new Scanner(System.in);
        System.out.print("Изначальный баланс: ");
        balance = in.nextInt();

        System.out.print("Сумма пополнения: ");
        AddedSum = in.nextInt();

        if (AddedSum >= 1000) {
            bonus = AddedSum / 100;
        } 
        else {
            bonus = 0;
        }

        FinalSum = balance + AddedSum + bonus;
        System.out.print("Итоговый баланс: " + FinalSum);
        // Также можно обойтись и без переменной "FinalSum", залив сумму в скобочки в последней кодовой строке,
        // чтобы это выглядело так: System.out.print("Итоговый баланс: " + (balance + AddedSum + bonus));
    }
}
