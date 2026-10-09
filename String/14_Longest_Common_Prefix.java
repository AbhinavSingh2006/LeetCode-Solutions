class Solution {
    public String longestCommonPrefix(String[] strs) {
    
       // Initializing  the common prefix with the first string.
       String startStr = strs[0]; 

       for(int i= 1; i<strs.length ; i++){  // Compare the current prefix with each remaining string
                String currentStr = strs[i];

                int min = Math.min(startStr.length(),currentStr.length());

                boolean prefix =false;

                int j = 0; 
                while(j < min){  // Compare characters of both strings until a mismatch is found
                    
                    if(startStr.charAt(j) != currentStr.charAt(j)){
                        startStr = startStr.substring(0,j);
                        prefix = true;
                        break;
                             // Exit the while loop when a mismatch is found.                    
                    }
                    j++;
                } 

                if(prefix == false ){
                     startStr = startStr.substring(0, min); // update the prefix to min for next string
                }
        }
        return startStr;
    }
}
