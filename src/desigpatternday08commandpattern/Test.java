package desigpatternday08commandpattern;

public class Test {

    public static void main(String[] args) {

        X x = new X();
        
        A a = new A(x);
        B b = new B(x);
        
        a.execute();
        b.execute();
        
    }

}

interface Command {

    public abstract void execute();

}

class X {

    public void m() {
        System.out.println("M");
    }

    public void n() {
        System.out.println("N");
    }

}

class A implements Command {

    X x;

    public A(X x) {
        this.x = x;
    }

    @Override
    public void execute() {

        System.out.println("Execute A");
        x.n();

    }

}

class B implements Command {

    X x;
    
    public B(X x) {
        this.x = x;
    }

    @Override
    public void execute() {

        System.out.println("Execute B");
        x.m();

    }

}
