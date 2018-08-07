public class Solution_344 {
    public String reverseString(String s) {
//        StringBuilder res=new StringBuilder();//第一种方法
//        for(int i=s.length()-1;i>=0;i--){
//            res.append(s.charAt(i));
//        }
//        return res.toString();
        char[] res=s.toCharArray();//第二种方法 运行时间较第一种快
        for(int i =0  ,j=s.length()-1;i<=j;i++,j--){
            char temp=res[j];
            res[j]=res[i];
            res[i]=temp;
        }
        return new String(res);
    }
    public static void main(String[] args){
        Solution_344 solution_344=new Solution_344();
        String res=solution_344.reverseString("hello");
        System.out.println(res);
    }
}
