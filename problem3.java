import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        System.out.println(UserMainCode.repeatFont(inp));
    }
}

class UserMainCode {
    public static String repeatFont(String inp) {
        int l = inp.length();
        System.out.println(l);
        if (l == 0) {
            return inp;
        } else if (l < 3) {
            return inp + inp;
        } else {
            String part = inp.substring(0, 3);
            return part + part;
        }
    }
}