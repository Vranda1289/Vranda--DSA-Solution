class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int sum1=0;
        int sum2=0;

        for(int i=0; i<n; i++){
            sum1+=gas[i];
        }

        for(int i=0; i<n; i++){
            sum2+=cost[i];
        }

        if(sum2>sum1){
            return -1;
        }

        int tank=0;
        int index=0;

        for(int i=0; i<n; i++){
            tank += gas[i]-cost[i];
            if(tank < 0){
                index= i+1;
                tank = 0;
            }
        }

        // for(int i=index; i<2*index-1; i++){
        //     tank=gas[i]-cost[i]+gas[i];
        //     if(tank>=0){
        //         return index;
        //     }
        // }
        return index;

    }
}