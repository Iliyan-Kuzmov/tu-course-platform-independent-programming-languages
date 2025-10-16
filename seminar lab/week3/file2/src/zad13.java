import java.util.Scanner;

public class zad13 {
    public static boolean isPalindrome(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] != nums[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] str = {1,2,2,1};
        boolean bool = isPalindrome(str);
        System.out.println(bool);
    }
}
