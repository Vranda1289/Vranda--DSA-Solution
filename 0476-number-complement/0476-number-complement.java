class Solution {
    public int findComplement(int num) {
        StringBuilder res= new StringBuilder();
        
        if(num==0) return 1;
        while(num>0){
           if(num%2==0){
            res.append("0");
           }
           else{
            res.append("1");
           }
            num=num/2;
        }
        String ans=res.reverse().toString();

        StringBuilder orig=new StringBuilder();
        for(int i=0; i<ans.length();i++){
            orig.append("1");
        }
        String answer=orig.toString();
        int a = Integer.parseInt(ans, 2);
        int b = Integer.parseInt(answer, 2);

        return a ^ b;
    }
}