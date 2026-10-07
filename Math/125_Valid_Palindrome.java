class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        String a = s.toLowerCase();
        while(left<right){
            if(!Character.isLetterOrDigit(a.charAt(left))){
                left++;
                continue;

            }
            if(!Character.isLetterOrDigit(a.charAt(right))){
                right--;
                continue;
                
            }
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
