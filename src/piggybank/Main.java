package src.piggybank;

import java.text.DecimalFormat;
import java.util.*;

public class Main
{
    static ArrayList<CoinAbstract> piggyBank = new ArrayList<CoinAbstract>();
    static String sign;
    static double total;
    static DecimalFormat fp = new DecimalFormat("$###,###.00");
    static double value;

    public static void printPiggyBank(ArrayList<CoinAbstract> piggyBank)
    {
        piggyBank.forEach((c) -> {
                if (c.getName().equals(""))
                {
                    sign = "$";
                } else
                {
                    sign = "";
                }

                System.out.println(sign + c.getQty() + " " + c.getName());
        });
    }

    public static void printValueOfPiggyBank(ArrayList<CoinAbstract> piggyBank)
    {
        piggyBank.forEach((c) -> {
            total += c.getTotalValue();
        });
        System.out.println("The piggy bank holds " + fp.format(total));
    }

    public static void subtractAmount(double amount)
    {
        value = amount;

        piggyBank.forEach((c) -> {
            total += c.getTotalValue();
        });
        if (amount > total)
        {
            System.out.println("Can't remove this amount!");
        } else {
            piggyBank.forEach((c) -> {

                value -= c.getTotalValue();
            });
        }
    }

    public static void main (String[] args)
    {

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.println(piggyBank);
        printPiggyBank(piggyBank);
        System.out.println("**************");
        printValueOfPiggyBank(piggyBank);
    }
}
