class Solution {
    public int numberOfSubstrings(String s) {
             int ans=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        int i=0;
        for(int j=0;j<s.length();j++){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            while(hm.size()==3){
                ans+=(s.length()-j);
                if(hm.get(s.charAt(i))>1){
                    hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                }
                else{
                    hm.remove(s.charAt(i));
                }
                i++;
            }
        }
        return ans;
    }
}

