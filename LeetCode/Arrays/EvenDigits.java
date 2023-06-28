// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
class EvenDigits {
    public static void main(String[] args){
        int[] nums = {555,90,82,1771,343,1,0};
        System.out.print(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        short even_digits=0;
        for(int num: nums)
            if((((int)Math.log10(num)+1)&1)==0) even_digits++;
        return even_digits;
    }
}