import java.util.TreeSet;
public class Solutioin_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> set=new TreeSet<>();
        for (String word:words){
            StringBuilder res= new StringBuilder();
            for(int i=0;i< word.length();i++)
                res.append(codes[word.charAt(i)-'a']);
            set.add(res.toString());
        }
        return set.size();
    }
    public static void main(String[] arg){
        Solutioin_804 solutioin_804=new Solutioin_804();
        String[] str={"gin", "zen", "gig", "msg"};
        int a=solutioin_804.uniqueMorseRepresentations(str);
        System.out.println(a);
    }
}
