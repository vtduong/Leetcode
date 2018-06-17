/***
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
***/

class Solution {
    public int addDigits(int num) {
        while(num / 10 != 0){
            num = breakIt(num);
        }
        return num;
    }
    
    private int breakIt(int num){
        int sum = 0;
        int quotient = num;
        while(quotient/10 !=0){
            int remain = quotient %10;
            sum += remain;
            quotient = quotient/10;
        }
        sum += quotient%10;
        return sum;
    }
}