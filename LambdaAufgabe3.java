import java.util.ArrayList;

public class LambdaAufgabe3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(7);
        list.add(50);
        list.add(17);
        list.add(10);
        list.add(5);

        //list.removeIf(  i -> (i%10)==0  );
        list.removeIf( (Integer i) -> { return (i%10)==0; } );

        System.out.println(list);



    }
}
