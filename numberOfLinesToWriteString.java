class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int numLines = 0;
        int ascii = 97;
        //create table for letter -> units
        HashMap<Character, Integer> table = new HashMap<>();
        for (int i = 0; i <= 25; i++){
            table.put((char)(ascii +i), widths[i]);
        }
        int current = 0;
        int usedUnits = 0;
        numLines++;
        //write until we runs out of letters
        while(current < S.length()){
            //go to next line if line is full or cannot fit a whole letter
            if(table.get(S.charAt(current)) > (100 - usedUnits)){
                numLines++;
                usedUnits = 0;
            }
            usedUnits += table.get(S.charAt(current));
            current++;
        }
        int[] result = new int[2];
        result[0] = numLines;
        result[1] = usedUnits;
        return result;
    }
    
}