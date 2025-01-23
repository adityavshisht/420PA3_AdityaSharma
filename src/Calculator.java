public class Calculator {
    private double result;

    public double add(double a, double b)
    {
        result = a + b;
        return result;
    }

    public double subtract(double a, double b)
    {
        result = a - b;
        return result;
    }

    public double multiply(double a, double b)
    {
        result = a * b;
        return result;
    }

    public double divide(double a, double b)
    {
        result = a / b;
        return result;
    }
}

