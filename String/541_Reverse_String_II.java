class Solution {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();
        int start = 0;
       
        for( start = 0; start < arr.length; start = start + 2*k){

            // right cannot go beyond the last index.
            // Math.min() handles the last block when last character is at lower index than start+k-1.
             int right =  Math.min(start + k -1 , arr.length -1);
             int left = start;

             while(left<right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
             }

        }
        return new String(arr);
    }
}
