import java.util.ArrayList;
import java.util.HashSet;
public class Solution_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet set=new HashSet();
        for(int num1:nums1)
            set.add(num1);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num2:nums2){
            if(set.contains(num2)){
                arr.add(num2);
                set.remove(num2);
            }
        }
        int[] ret=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ret[i]=arr.get(i);
        }
    return ret;
}
    public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        Solution_349 solution_349=new Solution_349();
        int[] ret=solution_349.intersection(nums1,nums2);
        for(int i=0;i<ret.length;i++)
            System.out.print(ret[i]+"\t");
    }
}
