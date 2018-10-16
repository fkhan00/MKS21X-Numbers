public class RationalNumber extends RealNumber
{
    super();
    private int numerator;
    private int denominator;
    public RationalNumber(int Numerator, int Denominator)
    {
        numerator = Numerator;
        denominator = Denominator;
    }

    public void reduce()
    {
    }

    public boolean compareTo(RationalNumber other)
    {
        return true;
    }

    public boolean equals(RationalNumber other)
    {
        return true;
    }

}