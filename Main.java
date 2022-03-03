import java.util.ArrayList;

//@FunctionalInterface
/*interface Tier{
	public String sagWas(String sound);

}
*/
//class Maus implements Tier{
//	@Override
//	public String sagWas(String txt) {
//		return "Tier " + txt;
//	}
//}
public class Main {

    public static void main(String[] args) {
		/*
		Tier maus = new Maus();
		System.out.println(maus.sagWas("Hallo"));
		*/
        //anonyme innere Klasse
		/*Tier maus2 =new Tier(){
		@Override
		public String sagWas(String txt){
		return "Tier " +txt;
		}
		};

		System.out.println(maus2.sagWas("hallo"));
		*/

        Rechner myrechner = new Rechner();


//		System.out.println(          myrechner.berechne(3, x -> {return x*x*x;}  )       ); //Lambda Ausdruck
//		System.out.println(          myrechner.berechne(3, x -> {return x*x;}    )         );
//

        ArrayList<String> liste = new ArrayList<>();

        liste.add("Jens");
        liste.add("Tim");
        liste.add("Kim");
        liste.add("Olli");


        //liste.remove(2);
        System.out.println(liste);



        //liste.removeIf(null); // Object


        liste.removeIf(        a -> a.contains("m")     );// Object Predicate ili ovako  ovo sto je ispod
        liste.removeIf( (String name) -> name.contains("m")     );  // ili ovako   sto je ispod
        liste.removeIf(          (String name) -> {  return    name.contains("m"); }    );

        //Die Liste soll alle Elemente entfernen, die ein i im Namen haben


        System.out.println(liste);

    }

}

class Rechner{
    public int a=10;

    double berechne(double x, Berechnung br) {
        return a + br.operiere(x);
    }



}

@FunctionalInterface
interface Berechnung{
    double operiere(double a);
}
