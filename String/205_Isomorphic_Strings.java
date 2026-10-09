class Solution {
    public boolean isIsomorphic(String s, String t) {
        int mapSt [] = new int[200];
        int mapTs [] = new int[200];

        if(s.length() != t.length()){
            return false;
        }
        for( int i = 0; i < s.length(); i++){
            if ( mapSt[s.charAt(i)] != mapTs[t.charAt(i)] ){
                return false;
            }

            mapSt[s.charAt(i)] = i+1;
            mapTs[t.charAt(i)] = i+1;
        }
        return true;
    }
}
