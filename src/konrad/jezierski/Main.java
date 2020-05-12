package konrad.jezierski;

public class Main {

    public static void main(String[] args) {
        Podstawowa b = new Pochodna1();
        Pochodna d = new Pochodna1();
        Pochodna1 d1 = new Pochodna1();

        b.f();
        b.g();
        b.h();

        d.f();
        d.g();
        d.h();

        d1.f();
        d1.g();
        d1.h();
    }
}
