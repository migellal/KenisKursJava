import java.math.BigInteger;
import java.util.Random;

/**
 * Created by Micha³ on 2015-06-07.
 */
public class Main {

    public static void main (String args[])
    {
        Main main = new Main();
        main.addingString();
        main.showString();
        main.showMath();
        main.showRandom();
    }

    public void addingString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "a";
        stringBuilder.append(str);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<100000; i++)
        {
            stringBuilder.append("a");
        }
        str = stringBuilder.toString();
        long endTime = System.currentTimeMillis();
        long result = endTime-startTime;
        System.out.println(result);
    }

    public void showString()
    {
        String str = "temporary text";
        str = str.charAt(0)+"";
        str = str.concat("abc");
        str = str.substring(1,3);
        str = str.toUpperCase();
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        System.out.println(str);
    }

    public void showMath()
    {
        int a = 90;
        a = Math.abs(a);
        double b = Math.pow(a, 2);
        a = (int)b;
        System.out.println(a);
        BigInteger bigInteger = new BigInteger("1234567898765432345678909876543234567890987654323456789");
        BigInteger bigInteger2 = new BigInteger("987654323456789098765432345678909876543456789034567898");
        System.out.println(bigInteger.add(bigInteger2));
    }

    public void showRandom()
    {
        Random rand = new Random();
        int a = rand.nextInt();
        System.out.println(a);
        int b = rand.nextInt(10);
        System.out.println(b);
//        for(int i = 0; i<100; i++)
//        {
//            System.out.println(rand.nextInt(5));
//        }
        for(int i = 0; i < 100; i++)
        {
            int x = rand.nextInt(10)+1;
            int y = rand.nextInt(10)+1;
            System.out.println(x + " * " + y);
        }
    }
}
