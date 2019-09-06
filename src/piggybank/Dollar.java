package src.piggybank;

public class Dollar extends CoinAbstract
{
    private String name = "$";
    private double value = 1.00;
    private int qty;

    public Dollar()
    {
        this.qty = 1;
    }

    public Dollar(int qty)
    {
        this.qty = qty;
    }

    //Getters
    @Override
    public String getName()
    {
        return "";
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
