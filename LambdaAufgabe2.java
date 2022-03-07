import java.util.ArrayList;

public class LambdaAufgabe2 {

    public static void main(String[] args) {

        ArrayList<String> vornamen = new ArrayList<>();
        vornamen.add("Jens");
        vornamen.add("Tim");
        vornamen.add("Kim");
        vornamen.add("Harry");
        //vornamen.removeIf (    (String b) -> { return b.contains("T"); }    );
        //vornamen.removeIf(  (String c) -> { return c.charAt(2)!='m'; }  );
        vornamen.removeIf( c -> c.charAt(2)!='m'  );

        System.out.println(vornamen);


    }
}
