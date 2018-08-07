public class Solution_461 {
    public int hammingDistance(int x, int y) {
        int z=x^y;
        int count=0;
        while(z!=0){
            count+=z&1;
            z=z>>1;
            //z=z&(z-1);
            //count++;
        }
        return count;
    }
    public static void main(String[] args){
        Solution_461 solution_461=new Solution_461();
        System.out.println(solution_461.hammingDistance(1,4));
    }
}
