import java.util.ArrayList;
public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr=new ArrayList();
        int index1=-1;
        int index2=-1;
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        int N=arr.size();
        while(N!=0){
            int a =arr.remove(N-1);
            int b=target-a;
            if(arr.contains(b)) {
                index1=N-1;
                index2=arr.indexOf(b);
                break;
            }
            N--;
        }
        int[] arr1=new int[2];
        arr1[0]=index1;
        arr1[1]=index2;
        return arr1;
    }
    public static  void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
        int[] test;
        Solution_1 solution_1=new Solution_1();
        test=solution_1.twoSum(nums,target);
        for(int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
    }
}
