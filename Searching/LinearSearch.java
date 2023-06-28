public class LinearSearch{
    public static void main(String [] args){
        int[] arr={18,12,9,14,77,50};
        int element=90;
        System.out.println(search(arr,element));
    }

    private static int search(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element)
                return i;
        }
        return -1;
    }
}