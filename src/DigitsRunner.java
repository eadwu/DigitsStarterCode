public class DigitsRunner
{
    public static void main(String[] args)
    {
        Digits d = new Digits(8675309);
        System.out.println(d.getDigitList());
        System.out.println(d.isStrictlyIncreasing());
        Digits d0 = new Digits(0);
        System.out.println(d0.getDigitList());
        System.out.println(d0.isStrictlyIncreasing());
    }
}