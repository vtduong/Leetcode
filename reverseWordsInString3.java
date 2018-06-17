/***
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

***/
class Solution {
    private StringBuilder list = new StringBuilder();
    
    public String reverseWords(String s) {
        //break the string into smaller strings
        String[] words = s.split(" ");
        //reverse each word and add them to a StringBuilder
        for(int i = 0; i < words.length; i++){
            reverseString(words, words[i], i);
        }
        return list.toString();
    }
    
    private void reverseString(String[] s, String word, int n){
        for(int i = word.length()-1; i >=0; i--){
            list.append(word.charAt(i));
        }
        if(n < s.length-1)
            list.append(" ");
    }
