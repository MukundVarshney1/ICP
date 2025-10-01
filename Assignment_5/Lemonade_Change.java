class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0;
        int b=0;
        if(bills[0]!=5){
            return false;
        }
        a=1;
        for(int i=1;i<bills.length;i++){
            if(bills[i]==5){
                a++;
            }
            else if(bills[i]==10){
                if(a>0){
                    a--;
                    b++;
                }
                else{
                    return false;
                }
            }
            else{
                if(b>0 && a>0){
                    b--;
                    a--;
                }
                else if(a>2){
                    a-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}