/**
There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1.

Note:

If there exists a solution, it is guaranteed to be unique.
Both input arrays are non-empty and have the same length.
Each element in the input arrays is a non-negative integer.
**/
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startIdx = 0;
        int i = 0;
        //find a station to start
        while(startIdx < gas.length){
            //pump & go to next station
            int remain = gas[startIdx] - cost[startIdx];
            int nextIdx = -1;
            if(remain >= 0){
                nextIdx = (startIdx +1) % gas.length;
                //pump & traveling in circle
                while(nextIdx != startIdx ){
                    remain += gas[nextIdx] - cost[nextIdx];
                    if(remain < 0)
                        break;
                    nextIdx = (nextIdx+1) % gas.length;
                }                
            } 
            if(nextIdx == startIdx)
                return startIdx;
            startIdx++;
        }
        return -1;
    }
}