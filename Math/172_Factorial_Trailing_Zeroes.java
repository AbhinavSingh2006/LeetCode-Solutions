class Solution {
    public int trailingZeroes(int n) {
        
        int count = 0;
        int i = 5;
        while(n/i>=1){ // i n ko kamse kam 1 bar divide kr rha hai baaki 
                        //25 se divide krwayenge taaki 2-5 agar exist krrhe ho ek sath multiply me to pta lge ,
                       //or 125 se divide krenge taaki 3 - 5 ka pta lge then aise hi 5 ke multiple badhte jayenge 
            count = count + n/i;
            i = i*5;
              
        }
        return count;
    }
}
        
  
