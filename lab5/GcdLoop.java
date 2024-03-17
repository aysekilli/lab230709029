public class GcdLoop {
    public static void main(String[] args)
    {int number1 = Integer.parseInt(args[0]);
     int number2 =Integer.parseInt(args[1]);

     int result = findGcd(number1,number2);
        System.out.println("GCD of "+number1 +" " + number2 + " = " + result);
    }
    private static int findGcd(int number1, int number2)
    {int remainder;
        do
        {remainder = number1 % number2;
        number1 = number2;
        number2 = remainder;
        }
        while (remainder !=0);
        return number1;
    }
}
