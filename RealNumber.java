public class RealNumber
{
    double value;
    public RealNumber(double newValue )
    {
        value = newValue;
    }
    public double getValue()
    {
        return value;
    }
    public boolean equals(RealNumber other) {
        return getValue() == other.getValue();
    }
}
