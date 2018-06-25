/**
Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B
**/

class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() == 0 && B.length() == 0)
            return false;
        if(A.length() == B.length()){
            ArrayList<Integer> indices = compare(A, B);
            if(indices.size() == 0){
                if(allSame(A))
                    return true;
            } else if(indices.size() == 2){
                String r = swap(A, indices.get(0), indices.get(1));
                if(r.equals(B))
                    return true;
            }
        }
        return false;
    }
    
    private ArrayList<Integer> compare(String a, String b){
        ArrayList<Integer> list = new ArrayList();
        if(a.equals(b))
            return list;
        for(int i =0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                list.add(i);
            }
        }
        return list;
    }
    
    private boolean allSame(String a){
        char c = a.charAt(0);
        for(int i = 1; i < a.length(); i++){
            if(a.charAt(i) != c)
                return false;
        }
        return true;
    }
    
    private String swap(String s, int idx1, int idx2){
        char[] charArray = s.toCharArray();
        char temp = s.charAt(idx1);
        charArray[idx1] = s.charAt(idx2);
        charArray[idx2] = temp;
        return new String(charArray);
    }
}