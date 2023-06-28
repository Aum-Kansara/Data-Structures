// https://leetcode.com/problems/richest-customer-wealth/
class RichestCustomer {
    public static void main(String[] args){
        // int[][] accounts = {
        //     {1,2,3},
        //     {3,2,1}
        // };

        // int[][] accounts = {
        //     {1,5},
        //     {7,3},
        //     {3,5}
        // };

        int[][] accounts = {
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max_wealth=0,temp;
        for(int i=0;i<accounts.length;i++){
            temp=0;
            for(int j=0;j<accounts[i].length;j++) 
                temp+=accounts[i][j];
            if(temp>max_wealth) 
                max_wealth=temp;
        }
        return max_wealth;
    }
}