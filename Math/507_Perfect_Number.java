class Solution {
    public boolean checkPerfectNumber(int num) {

       if (num <= 1) {
          return false;
       }
      
        int sum=0;
        for(int i = 2 ; i <=(int)Math.sqrt(num); i++){ // i started from 2 here because 1 is universal divisor and its pair will be num itself that's why have to handle it seperately , i limit to square root so that make T.C-root n.
            if(num%i == 0 ){
                 if(i == num/i){ // where i will same as its pair will take only one from pair . 
                    sum = sum + i;
                 }else{
                   sum = sum + i + num/i;
                  }
            }
        }
       int result = sum +1; // here one is added to sum sepeately;
       return result == num; 
        
    }
}
