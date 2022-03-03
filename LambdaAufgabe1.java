import java.util.ArrayList;

public class LambdaAufgabe1 {

    public static void main(String[] args) {


        ArrayList<String> nachnamen = new ArrayList<>();
        nachnamen.add("Schmidt");
        nachnamen.add("Müller");
        nachnamen.add("Meier");
        nachnamen.add("Pütz");
        nachnamen.add("Simon-Meier");



        //liste.remove(2);
        System.out.println(nachnamen);

          //Ohne ü
//        nachnamen.removeIf(        u -> u.contains("ü")     );
//        nachnamen.removeIf( (String name) -> name.contains("ü")     );
//        nachnamen.removeIf(          (String name) -> {  return    name.contains("ü"); }    );
//        System.out.println(nachnamen);

        //Mit ü
//        nachnamen.removeIf(        u -> !u.contains("ü")     );
//        nachnamen.removeIf( (String name) -> !name.contains("ü")     );
//        nachnamen.removeIf(          (String name) -> {  return    !name.contains("ü"); }    );
//        System.out.println(nachnamen);

        //Anfangsbuchstaben  ohne M
//        nachnamen.removeIf(        m -> m.startsWith("M")     );
//        System.out.println(nachnamen);
        //Anfangsbuchstaben  ohne M
        nachnamen.removeIf(        m -> !m.startsWith("M")     );
        System.out.println(nachnamen);

    }

}



