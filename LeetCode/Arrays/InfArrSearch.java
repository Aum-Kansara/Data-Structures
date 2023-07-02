public class InfArrSearch{
    public static void main(String[] args){
        int[] arr={-9,-8,-7,-6,-5,-4,-2,-1,0,1,2,3,4,5,6,7,8,9};
        int[] range=findRange(arr,-6);
        System.out.println(range[0]+" "+range[1]);
        System.out.print(binarySearch(arr,-6,range[0],range[1]));
    }

    private static int[]  findRange(int[] arr,int target){
        int[] range={-1,-1};
        int index1=7,index2=8,multiplyer=1;
        while(true){
            if(target>=arr[index1] && target<=arr[index2]){
                range[0]=index1;
                range[1]=index2;
                break;
            }
            // System.out.println(index1+" "+index2);
            index1=index1-multiplyer;
            index2=index2+multiplyer;
            multiplyer*=2;
        }
        return range;
    }

    private static int binarySearch(int[] arr,int target,int start,int end){
        int mid;
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