package Lab5;
//Шаблоны
interface FractionInterface {
    double getRealValue();
    void setNumerator(int numerator);
    void setDenominator(int denominator);
}

class Fraction implements FractionInterface {
    private int numerator;
    private int denominator;
    private double realValue;
    private boolean isCached;

    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        this.isCached = false;
    }

    @Override
    public double getRealValue() {
        if (!isCached) {
            realValue = (double) numerator / denominator;
            isCached = true;
        }
        return realValue;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        this.isCached = false;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -denominator;
        } else {
            this.denominator = denominator;
        }
        this.isCached = false;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }
}
