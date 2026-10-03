class Solution {
    public int countPrimes(int n) {

        if(n<=2){
            return 0;  // There are no primes strictly less than n.
        }

        int[] prime = new int[n];
        // Java initializes int arrays with 0 by default. so 0 represents a prime candidate. 
        // no external loop need to mark every element prime with 0;its already mark in initial every element will prime 

        for(int i=2;i*i<=n;i++){  //will check till sqroot n only
            if(prime[i]==0){      // i is prime, so mark all its multiples as composite. 
                for(int j=i*i ; j<n ; j=j+i){  // Start from i*i because smaller multiples are already marked.
                    prime[j]=1;       // 1 is here for composite, at j the elemnt is now composite
                }
            }
        }

        int primeCount=0;
        for(int i=2;i<n;i++){
          if(prime[i] == 0){
              primeCount++;
            }
 
        } return primeCount;
    
    }
}
