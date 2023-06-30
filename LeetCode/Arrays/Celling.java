public class Celling{
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(getCelling(arr,3.2));
    }

    private static int getCelling(int[] arr,double target){
        int start=0,end=arr.length-1,mid;
        if(target>arr[end]) return -1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==arr[mid])
                return arr[mid];
            else if(target<arr[mid])
                end=mid-1;
            else
                start=mid+1;
                
        }
        return arr[start];
    }
}