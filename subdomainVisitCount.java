// A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
// Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
// We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.

class Solution {
    private Map<String, Integer> map = new HashMap();
    public List<String> subdomainVisits(String[] cpdomains) {

        for (int i = 0; i < cpdomains.length; i++){
            //for each pair, break it into subdomain
            int count = Integer.parseInt(cpdomains[i].split(" ")[0]);
            String domain = cpdomains[i].split(" ")[1];
            String[] sub = domain.split("\\.");
            //add each subdomain and its count to hashtable
            if(sub.length > 0){
                addCount(sub[sub.length - 1], count);
                if(sub.length > 2){
                    addCount(sub[1] + "." + sub[2], count);
                }
            }
            addCount(domain, count);
            
        }
        
        //construct the output
        List<String> output = new ArrayList();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            output.add(entry.getValue() + " " + entry.getKey());
        }
        return output;
    }
    
    private void addCount(String key, int count){
        if(map.containsKey(key))
            map.put(key, map.get(key) + count);
        else map.put(key, count);
    }
}