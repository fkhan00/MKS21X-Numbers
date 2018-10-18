public class RationalNumber extends RealNumber
{
    private int numerator;
    private int denominator;

    public RationalNumber(int num, int denom)
    {
        super(0.0);
        if (num == 0 || denom == 0)
        {
          num = 0;
          denom = 1;
        }
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

    public int gcd(int a, int b)
    {
      int greatest = 1;
      for (int i = 1; i <= a; i++)
      {
          if (a % i == 0 && b % i == 0)
          {
              greatest = i;
          }
      }
      return greatest;
    }
    private RationalNumber reduce()
    {
        RationalNumber output = new RationalNumber(getNumerator() / gcd(getNumerator(), getDenominator()), getDenominator() / gcd(getNumerator(), getDenominator()));
        return output;
    }

    public double getValue()
    {
        return numerator / (double)denominator;
    }
    public RationalNumber add(RationalNumber other)
    {
        int top = this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator();
        int bottom =  this.getDenominator() * other.getDenominator();
        RationalNumber output = new RationalNumber(top, bottom);
        return output.reduce();
    }
    public RationalNumber multiply(RationalNumber other)
    {
        RationalNumber answer = new RationalNumber(getNumerator() * other.getNumerator(), getDenominator() * other.getDenominator());
        return answer.reduce();
    }
    public RationalNumber reciprocal()
    {
        RationalNumber recip = new RationalNumber(getDenominator(), getNumerator());
        return recip.reduce();
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
        return output.reduce();
    }
    public boolean equals(RationalNumber other)
    {

        return this.reduce().getNumerator() == other.reduce().getNumerator() && this.reduce().getDenominator() == other.reduce().getDenominator();
    }
    public String toString()
    {
        reduce();
        String down = "" + getDenominator();
        String up = "" + getNumerator();
        if (getDenominator() == 1)
        {
          return up;
        }
        if (getDenominator() == getNumerator())
        {
          return "" + 1;
        }
        if (getNumerator() == 0)
        {
          return "" + 0;
        }
        return up + "/" + down;
    }



}
