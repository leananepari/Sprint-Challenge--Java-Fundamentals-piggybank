package src.piggybank;

public class Quarter extends CoinAbstract
{
    private String name = "Quarter";
    private double value = 0.25;
    private int qty;

    public Quarter()
    {
        this.qty = 1;
    }

    public Quarter(int qty)
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
