import java.util.ArrayList;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println(Three(1,2,3));
    }
    public static ArrayList Three (int a, int b, int c){
        ArrayList from_method = new ArrayList();
        from_method.add(a);
        from_method.add(b);
        from_method.add(c);
            return from_method;
    }
}
