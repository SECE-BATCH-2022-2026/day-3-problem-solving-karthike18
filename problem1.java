import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int count = UserMainCode.countoccurances(s1,s2);
        System.out.print(count);
    }
}
class UserMainCode{
    public static int countoccurances(String s1,String s2){
        int c = 0;
        for(int i=0;i<=s1.length()-s2.length();i++){
            if(s1.substring(i,i+s2.length()).equals(s2)){
                c++;
            }
        }
        return c;
    }
}