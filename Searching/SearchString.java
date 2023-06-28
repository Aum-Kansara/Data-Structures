public class SearchString{
    public static void main(String[] args){
        String name="Aum Kansara";
        System.out.println(search(name,'a'));
        System.out.println(search(name,'r',6,10));
    }

    private static int search(String str,char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target) return i;
        }
        return -1;
    }

    private static int search(String str,char target,int start,int end){
        for(int i=start;i<=end;i++){
            if(str.charAt(i)==target) return i;
        }
        return -1;
    }
}