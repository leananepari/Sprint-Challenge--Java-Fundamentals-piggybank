package src.piggybank;

import java.math.BigDecimal;
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
            for (int i = 0; i < piggyBank.size(); i++) {
                if (value > 0) {
                    if (piggyBank.get(i).getTotalValue() <= value) {
                        value -= piggyBank.get(i).getTotalValue();
                        value = Math.round(value * 100.0) / 100.0;
                        piggyBank.remove(i);
                        i--;
                    } else
                    {
                        double numOfCoins = Math.floor(value / piggyBank.get(i).getValue());
                        int intNumOfCoins = (int)numOfCoins;
                        value -= piggyBank.get(i).getValue() * numOfCoins;
                        value = Math.round(value * 100.0) / 100.0;
                        piggyBank.get(i).setQty(piggyBank.get(i).getQty() - intNumOfCoins);
                    }
                } else
                {
                    break;
                }
            }
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

        subtractAmount(1.5);
        System.out.println("AFTER SUBTRACT");
        printPiggyBank(piggyBank);

    }
}
