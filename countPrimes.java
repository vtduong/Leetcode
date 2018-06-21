/**
Count the number of prime numbers less than a non-negative number, n.
**/

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] prime = new boolean[n];
        //construct an array of all numbers less than n
        for(int i = 2; i < prime.length; i++){
            prime[i] = true;
        }
        //check all number less than square root of n
        for(int i = 2; i*i < n; i++){
            //ignore all un-prime numbers
            if(!prime[i]) continue;
            //when a new number is detected an not marked as un-prime
            for(int j = i*i; j < n; j+=i){
                prime[j] = false;
            }
        }
        
        //count all unmarked number
        for(int i = 2; i < n; i++){
            if(prime[i]) count++;
        }
        
        return count;
    }
    
}