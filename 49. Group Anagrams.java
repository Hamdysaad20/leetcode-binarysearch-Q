// Solve it using HashMap
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          ArrayList<List<String>> list = new ArrayList<>();
          if(strs.length == 0) return list;
 HashMap <String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char [] charString = str.toCharArray();
            Arrays.sort(charString);
           
            if(!map.containsKey(String.valueOf(charString))){
                map.put(String.valueOf(charString), new ArrayList<>());
            }
            map.get(String.valueOf(charString)).add(str);
            
        }
         for (String key : map.keySet()) {
            list.add(map.get(key));

        }
        return list;
    }
}
