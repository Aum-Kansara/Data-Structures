// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class LetterCelling{
    public static void main(String[] args){
        // char[] letters={'e','e','e','e','e','e','n','n','n','n'};
        char[] letters={'c','f','j'};
        System.out.println(getCelling(letters,'g'));
    }

    private static char getCelling(char[] arr,char target){
        int start=0,end=arr.length-1,mid;
        
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        
        if(start>=arr.length-1){
            System.out.println(start);
            return arr[0];
        }
        return arr[start];
    }
}