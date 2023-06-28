public class OrderAgnosticBinarySearch{
    public static void main(String[] args){
        // int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr={9,8,7,6,5,4,3,2,1};
        System.out.print(AgnBinarySearch(arr,8));
    }

    private static int AgnBinarySearch(int arr[],int target){
        int start=0,end=arr.length-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            if(arr[start]<arr[end]){
                if(target>arr[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
            else{
                if(target>arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}