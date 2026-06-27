class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int reverse1=0;
        int reverse2=0;
        while(num>0){
            int digit1=num%10;
            reverse1=reverse1*10+digit1;
            num/=10;
        }
        while(reverse1>0){
            int digit2=reverse1%10;
            reverse2=reverse2*10+digit2;
            reverse1/=10;
        }
        if(reverse2==temp){
            return true;
        }
        return false;
    }
}