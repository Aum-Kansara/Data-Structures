public class SearchMinMax{
    public static void main(String[] args){
        int[] arr={45,3,556,3,576,-2};
        int[][] arr2d={
            {1,34,7,7},
            {3,-2,-23,354},
            {1,6,3094,-354,43}
        };
        System.out.println(getMin(arr));
        System.out.println(getMax(arr));
        System.out.println(getMax(arr2d));
        System.out.println(getMin(arr2d));
    }   

    private static int getMin(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }

    private static int getMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    private static int getMax(int[][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                if(arr[i][j]>max) max=arr[i][j];
        }
        return max;
    }

    private static int getMin(int[][] arr){
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                if(arr[i][j]<min) min=arr[i][j];
        }
        return min;
    }
}