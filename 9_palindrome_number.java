class Solution {
    public boolean isPalindrome(int x) {
     int   seeda=x ,rev=0;
        while(x>0){
        int temp ;
        temp=x%10;
        rev=(rev*10)+temp;
           x=x/10;
        };
        if(seeda==rev){
            return true;
        }else{return false;}


    }
}