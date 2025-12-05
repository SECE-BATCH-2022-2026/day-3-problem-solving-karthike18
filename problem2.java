
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int a = s.nextInt();
        int result = UserMainCode.calculateSum(n,m,a);
        System.out.print(result);
    }
}
class UserMainCode{
    public static int calculateSum(int n,int m,int a){
        
        if(n==13){
            return a;
        }
        else if (m==13) {
            return n;
        }
        else if(a==13){
            return m;
        }
        else{
            return n + m + a;
        }
        
    }
}