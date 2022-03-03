import java.util.ArrayList;

public class LambdaAufgabe1 {

    public static void main(String[] args) {


        ArrayList<String> nachnamen = new ArrayList<>();
        nachnamen.add("Schmidt");
        nachnamen.add("Müller");
        nachnamen.add("Meier");
        nachnamen.add("Pütz");



        //liste.remove(2);
        System.out.println(nachnamen);


        nachnamen.removeIf(        u -> u.contains("ü")     );
        System.out.println(nachnamen);

        nachnamen.removeIf( (String name) -> name.contains("m")     );
        nachnamen.removeIf(          (String name) -> {  return    name.contains("m"); }    );


//        nachnamen.removeIf(          (String name) -> {  return    !name.contains("ü"); }    );
//        System.out.println(nachnamen);

    }

}



