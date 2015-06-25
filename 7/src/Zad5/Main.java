package Zad5;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {

    public static void main(String[] args) {
        int[] tab = {5, 9 , 2, 7, 12, 9, 9, 45, 25, 45, 65};
        System.out.println(arrayCount9(tab));
    }

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int n=0; n<nums.length; n++)
        {
            if (nums[n]==9)
            {
                count++;
            }
        }
        return count;

    }
}
