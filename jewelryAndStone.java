class Solution {
    public int numJewelsInStones(String J, String S) {
        //use a hashtable to keep track of distinct chars
        HashMap<Character, Integer> table = new HashMap<>();
        //add distinct char to table
        for (int i = 0; i < J.length(); i++){
            table.put(J.charAt(i), 0);
        }
        //count chars
        for (int i = 0; i < S.length(); i++){
            if(table.get(S.charAt(i)) != null){
                table.put(S.charAt(i), table.get(S.charAt(i))+1);
            }
        }
        //iterate the table and get the sum of count
        int sum = 0;
        for(Character key : table.keySet()){
            sum+= table.get(key);
        }
        return sum;
    }
}