package src.piggybank;

public class Nickel extends CoinAbstract
{
    private String name = "Nickel";
    private double value = 0.05;
    private int qty;

    public Nickel()
    {
        this.qty = 1;
    }

    public Nickel(int qty)
    {
        this.qty = qty;
    }

    //Getters
    @Override
    public String getName()
    {
        if (this.qty == 1)
        {
            return this.name;
        } else
        {
            return this.name + "s";
        }
    }

    @Override
    public double getValue()
    {
        return this.value;
    }

    @Override
    public int getQty()
    {
        return this.qty;
    }

    @Override
    public double getTotalValue()
    {
        return Math.round(this.value * this.qty * 100.0) / 100.0;
    }

    //Setters
    @Override
    public void setQty(int qty)
    {
        this.qty = qty;
    }

    @Override
    public void setValue(double value)
    {
        this.value = value;
    }
}
