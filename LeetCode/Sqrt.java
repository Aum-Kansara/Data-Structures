public class Sqrt{
    public static void main(String[] args){
        System.out.println(mySqrt(2145727684));
        System.out.println(mySqrt(26));
        // System.out.println("2145745656 * 2145745656 = "+2145745656*2145745656);
    }

    public static int mySqrt(int x) {
        int start=0,end=x,mid=1;
        if(x==0) return 0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid==(x/mid))
                return mid;
            else if(mid<(x/mid))
                start=mid+1;
            else
                end=mid-1;
        }
        return end;
    }
}