public class GcdRecursion
{
    public static void main(String[]args)
    {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int result = findGcd(number1,number2);
        System.out.println("GCD of " + number1 + " " + number2 + " = " + result);
    }
    // findGcd(number1,number2) = findGcd(number2, number1%number2)
    //base : number1%number2 == 0 return number2
    private static int findGcd(int number1, int number2)
    {
        int remainder = number1 % number2;
        if(remainder == 0)
        {
            return number2;
        }
        return  findGcd(number2,remainder);
    }
}
