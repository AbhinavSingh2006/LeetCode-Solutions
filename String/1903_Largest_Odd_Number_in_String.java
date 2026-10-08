class Solution {
    public String largestOddNumber(String num) {
       int last = num.length() -1;

       if((num.charAt(last) -'0') %2 ==1){  //  Start from the right side of the string and find the rightmost odd digit
            return num;  // If the last digit is already odd, return the complete string.
        }
       
      for(int i = last-1; i>=0; i--){
           if((num.charAt(i)-'0') %2 ==1){

               return num.substring(0,i+1);
            }
       }
        return "";
       
    }
}
