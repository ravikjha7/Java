import java.util.*;
public class StringTokenizerDemo {
    public static void main(String[] args) {
        // Two Tokens, if we use \n it does not need to be passed in String Tokenizer
        String data = "name=Abhi+address=Yavatmal+degree=cse";

        StringTokenizer stk = new StringTokenizer(data,"=+");

        String s;

        while(stk.hasMoreElements()) {
                s = stk.nextToken();
                System.out.println(s);
        }

    }
}
