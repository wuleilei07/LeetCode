public class Solution_784 {
    public String numJewelsInStones(String J, String S) {
        String S1=S.replaceAll("[^"+J+"]","");
        return S1;

    }
    public static void main(String[] args){
        Solution_784 solution=new Solution_784();
        String S1=solution.numJewelsInStones("aA","aAAbbbb");
        System.out.println(S1.toString());
        }
}

