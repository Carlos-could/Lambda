import java.util.ArrayList;

public class LambdaAufgabe2 {

    public static void main(String[] args) {

        ArrayList<String> vornamen = new ArrayList<>();
        vornamen.add("Jens");
        vornamen.add("Tim");
        vornamen.add("Kim");
        vornamen.add("Harry");

        vornamen.removeIf (    (String b) -> {return b.contains("**m"); }    );

        System.out.println(vornamen);





//        System.out.println(vornamen);
//
//        String x = vornamen.get(1);
//        System.out.println(x);
//
//        char m = x.charAt(2) ;
//        System.out.println(m);
//
    }
}
