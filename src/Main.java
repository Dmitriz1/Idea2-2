import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int st; // первоначальный баланс
        int add; // сумма пополнения
        int bon; // количество бонусных рублей
        int kon; // итоговый баланс

        Scanner in = new Scanner(System.in);
        System.out.print("Изначальный баланс: ");
        st = in.nextInt();

        System.out.print("Сумма пополнения: ");
        add = in.nextInt();

        if (add >= 1000)
            bon = add / 100;
        else
            bon = 0;

        kon = st + add + bon;
        System.out.print("Итоговый баланс: " + kon);
        // Также можно обойтись и без переменной "kon", залив сумму в скобочки в последней кодовой строке,
        // чтобы это выглядело так: System.out.print("Итоговый баланс: " + (st + add + bon));
    }
}