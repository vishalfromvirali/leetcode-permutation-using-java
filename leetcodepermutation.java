import java.util.*;
class leetcodepermutation{
    public static void main(String[]args){
        int[] nums={1,4,5,7,9,0,3};
        int[] ans =new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            ans[i]=nums[nums[i]];

        }
        
        System.out.println(nums);
    }
}