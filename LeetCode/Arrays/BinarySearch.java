public class BinarySearch{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.print(binarySearch(arr,8));
    }

    // private static int search(int[] arr,int target,int start,int end){
    //     // Using Recursion
    //     int mid;
    //     mid=(start+end)/2;
    //     if(start>end)
    //         return -1;
    //     else if(arr[mid]==target)
    //         return mid;
    //     else if(arr.length<=1)
    //         return -1;
    //     else if(target>arr[mid])
    //         return search(arr,target,mid+1,end);
    //     return search(arr,target,start,mid-1);
    // }

    private static int binarySearch(int[] arr,int target){
        int start=0,end=arr.length-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            else if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    
}