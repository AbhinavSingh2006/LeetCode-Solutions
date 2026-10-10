class Solution {
  
    public void rotate(int[] nums, int k) {

        k = k % nums.length;  // Handle cases where k is greater than the array length
        int i = 0;
        int j = nums.length -1; 

       //Reverse the entire array
        Reverse(nums,i,j);
      
      //Reverse the last (n - k) elements
        Reverse(nums,k,j);

      //Reverse the first k elements
        Reverse(nums,i,k-1);
    }
  
  // Helper method to reverse a portion of the array
    void Reverse(int[] nums, int a, int b) {
        while(a<b){
            int  temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
   }
  
}
