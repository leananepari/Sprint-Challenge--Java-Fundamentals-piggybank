package src.piggybank;

public abstract class CoinAbstract
{
    public CoinAbstract()
    {
    }

    public abstract String getName();
    public abstract double getValue();
    public abstract int getQty();
    public abstract double getTotalValue();

    public abstract void setQty(int qty);
    public abstract void setValue(double value);
}
