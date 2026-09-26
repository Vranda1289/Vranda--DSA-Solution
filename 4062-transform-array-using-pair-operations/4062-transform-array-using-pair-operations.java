class Solution {
    public boolean canTransform(int[] source, int[] target) {
        if(source.length!=target.length){
            return false;
        }
        long sum1=0;
        long sum2=0;

        for(int i=0; i<source.length; i++){
            sum1+=source[i];
        }
        for(int i=0; i<target.length; i++){
            sum2+=target[i];
        }

        if(sum1==sum2){
            return true;
        }
        return false;
    }
}