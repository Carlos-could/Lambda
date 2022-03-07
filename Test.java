public class Test {
    public static void print() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        Test obj = null;

        obj.print();
        System.out.println(obj);
    }
}