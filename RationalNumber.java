public class RationalNumber extends RealNumber
{
    super(0.0);
    private int numerator, denominator;

    public RationalNumber(int num, int denom)
    {
        numerator = num;
        denominator = denom;
    }
    public int getNumerator()
    {
        return numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }

    public void reduce()
    {
        int greatest = 1;
        int nums = getNumerator();
        for (int i = 0; i < nums; i++)
        {
            if (getNumerator() % i == 0 && getDenominator() % i == 0)
            {
                greatest *= i;
                nums /= i;
            }
        }
        numerator /= greatest;
        denominator /= greatest;
    }

    public double getValue()
    {
        return numerator / denominator;
    }
    public RationalNumber add(RationalNumber other)
    {
        reduce();
        other.reduce();
        int top = this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator();
        int bottom =  this.getDenominator() * other.getDenominator();
        RationalNumber output = new RationalNumber(top, bottom);
        return output;
    }
    public RationalNumber multiply(RationalNumber other)
    {
        reduce();
        other.reduce();
        RationalNumber answer = new RationalNumber(getNumerator() * other.getNumerator(), getDenominator() * other.getDenominator());
        return answer;
    }
    public RationalNumber reciprocal()
    {
        reduce();
        RationalNumber recip = new RationalNumber(getDenominator(), getNumerator());
        return recip;
    }
    public RationalNumber divide(RationalNumber other)
    {
        return this.multiply(other.reciprocal());
    }
    public RationalNumber subtract(RationalNumber other)
    {
        reduce();
        other.reduce();
        int top = this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator() * -1;
        int bottom =  this.getDenominator() * other.getDenominator();
        RationalNumber output = new RationalNumber(top, bottom);
        return output;
    }
    public boolean equals(RationalNumber other)
    {
        reduce();
        other.reduce();
        return getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator();
    }
    public String toString()
    {
        String down = "" + getDenominator();
        String up = "" + getNumerator();
        return down + "/" + up;
    }



}

