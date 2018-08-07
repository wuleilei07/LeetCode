public class Solution_771 {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        for(int i=0;i<J.length();i++){
            char a=J.charAt(i);
            for(int j=0;j<S.length();j++){
                if(a==S.charAt(j)){
                    count++;
                }
            }
        }
        return count;
        //一行代码解决
        //return S.replaceAll("[^"+J+"]","").length();
    }
    public static void main(String[] args){
        Solution_771 solution=new Solution_771();
        System.out.println(solution.numJewelsInStones("aA","aAAbbbb"));
    }
}
