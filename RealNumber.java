public class RealNumber {
    private double value;
    public RealNumber(double newValue)
    {
        value = newValue;
    }
    public double getValue()
    {
        return value;
    }
    public boolean equals(RealNumber other)
    {
        return this.getValue() == other.getValue();
    }
    public double add(RealNumber other)
    {
        return this.getValue()  + other.getValue();
    }
    public double multiply(RealNumber other)
    {
        return this.getValue() * other.getValue();
    }
    public double subtract(RealNumber other)
    {
        return this.getValue() - other.getValue();
    }
    public double divide(RealNumber other)
    {
        return this.getValue() / other.getValue();
    }
    public String toString(){
        return "" + value;
    }
}
