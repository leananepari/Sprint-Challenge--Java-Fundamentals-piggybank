package src.piggybank;

public class Penny extends CoinAbstract
{
    private String name = "Penny";
    private double value = 0.01;
    private int qty;

    public Penny()
    {
        this.qty = 1;
    }

    public Penny(int qty)
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
            return "Pennies";
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
        return this.value * this.qty;
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
