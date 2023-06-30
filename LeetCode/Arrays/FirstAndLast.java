// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;
public class FirstAndLast{
    public static void main(String[] args){
        int[] nums = {5,7,7,7,7,7,8,8,8,10};
        // int[] nums = {};
        System.out.println(Arrays.toString(searchRange(nums,1)));
    }
    private static int[] searchRange(int[] nums,int target){
        int start=0,end=nums.length-1,mid=0;
        int[] ans={-1,-1};

        // Check For First Occurence
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==nums[mid]){
                ans[0]=mid;
                end=mid-1;
            }
            else if(target>nums[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        if(nums[start]!=-1){
            start=0;
            end=nums.length-1;
            // Check For Last Occurence
            while(start<=end){
                mid=start+(end-start)/2;
                if(target==nums[mid]){
                    ans[1]=mid;
                    start=mid+1;
                }
                else if(target>nums[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return ans;
    }
}