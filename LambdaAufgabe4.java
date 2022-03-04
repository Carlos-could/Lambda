import java.util.ArrayList;

public class LambdaAufgabe4 {

    public static void main(String[] args) {

        ArrayList<Student> studenten = new ArrayList<Student>();

        studenten.add(new Student("Jens",22));
        studenten.add(new Student("Hans",38));
        studenten.add(new Student("Kim",13));
        studenten.add(new Student("Tim",28));
        studenten.add(new Student("Fritz",44));



        studenten.removeIf( s -> !(s.alter>18) || !s.name.contains("i")  );
        //studenten.removeIf( (Student s) -> {return !(s.alter>18) || !(s.name.contains("i")) ;} );

        System.out.println("\n" + studenten.toString() );
        // [Student{name='Tim', alter=28}, Student{name='Fritz', alter=44}]
    }
}

class Student{
    public String name;
    public int alter;

    public Student(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}
