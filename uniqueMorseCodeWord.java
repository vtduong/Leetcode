class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        //create a table of word -> Morse
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-" ,".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character, String> table = new HashMap<>();
        int ascii = 97;
        for(int i = 0; i <= 25; i++){
            table.put((char)(ascii +i), morse[i]);
        }

        
        //transform each word into Morse
        ArrayList<String> transformed = new ArrayList<>();
        for (String w : words){
            StringBuilder string = new StringBuilder(w.length());
            for(int i = 0; i < w.length();i++){
                string.append(table.get(w.charAt(i)));
            }
            transformed.add(string.toString());
        }
        //count number of distinct transformation
        Set<String> unique = new HashSet<>(transformed);
        return unique.size();
    }
}