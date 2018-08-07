public class Solution_709 {
    public String toLowerCase(String str) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                res.append((char)(str.charAt(i)-('A'-'a')));
            }
            else res.append(str.charAt(i));
        }
        return res.toString();
        //return str.replaceAll("[A-Z]" ,"");
    }

    public static void main(String[] args){
        Solution_709 solution709=new Solution_709();
        System.out.println(solution709.toLowerCase("PiTAs"));
    }
}
