class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        int ans = 0,flag = 0,count = 0,temp = 0;
        for(int i: map.values()){
            if(i%2 == 0){
                ans+=i;
            }
            else{
                ans +=(i-1);
                flag = 1;
            }
            count++;
            temp = i;
        }
        
        if(count == 1)return temp;
        if(flag == 1)return ans+1;
        return ans;
    }
}