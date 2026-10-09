class Solution {
    public boolean isAnagram(String s, String t) {
      
        if(s.length() != t.length()){
            return false;
        }
        
        int [] frequency = new int[26];
        for( int i =0; i<s.length(); i++ ){
            int count = s.charAt(i) - 'a';
            frequency[count]++;

            int dec = t.charAt(i) - 'a';
            frequency[dec]--;
        }

        for( int i=0; i<frequency.length;i++ ){
            if(frequency[i] !=0 ){
               return false;
            }
        }

     return true;
    }
}
