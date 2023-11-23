public class A {
    int i = 5;

    class B {
        void play() {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        A o = new A();
        A.B p = o.new B();
        p.play();
    }
}
