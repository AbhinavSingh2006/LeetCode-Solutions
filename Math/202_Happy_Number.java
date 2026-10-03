class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        
        while(n!=1){
             if(set.contains(n)){ // pattern started repeat i.e same number occured again 
                return false;
             }
             set.add(n); // if new number occurring then add 

             int sum = 0;
             while(n>0){

                int y = n%10;
                int sq = y*y;
                sum = sum + sq;
                n = n/10;
             }
             n = sum; 
        } 

        return true;
    }
}
