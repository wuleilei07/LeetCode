import java.util.ArrayList;
import java.util.HashMap;
public class Solution_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num1:nums1){
            if(!map.containsKey(num1)){
                map.put(num1,1);
            }
            else
                map.put(num1,map.get(num1)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num2:nums2){
            if(map.containsKey(num2)){
                arr.add(num2);
                map.put(num2,map.get(num2)-1);
                if(map.get(num2)==0)
                    map.remove(num2);
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
        Solution_350 solution_350=new Solution_350();
        int[] ret=solution_350.intersect(nums1,nums2);
        for(int i=0;i<ret.length;i++)
            System.out.print(ret[i]+"\t");
    }
}

