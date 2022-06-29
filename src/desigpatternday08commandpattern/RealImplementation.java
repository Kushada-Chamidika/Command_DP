package desigpatternday08commandpattern;

public class RealImplementation { // invoker

    public static void main(String[] args) { //invoke

        Math math = new Math();

//        System.out.println("Calling Plus");
//        math.plus(100, 123);
//
//        System.out.println("Calling Minus");
//        math.plus(340, 213);

        System.out.println("Calling Plus");

        plusCommand plCmnd = new plusCommand(math);
        plCmnd.execute(100, 123);

        System.out.println("Calling Minus");

        minusCommand mnCmnd = new minusCommand(math);
        mnCmnd.execute(340, 213);

    }

}

class Math { //reciever

    public void plus(int num1, int num2) { //action method
        System.out.println(num1 + num2);
    }

    public void minus(int num1, int num2) { //action method
        System.out.println(num1 - num2);
    }

}

interface intCommand {

    public void execute(int num1, int num2);

}

class plusCommand implements intCommand {

    Math m;

    public plusCommand(Math m) {
        this.m = m;
    }

    @Override
    public void execute(int num1, int num2) {
        m.plus(num1, num2);
    }

}

class minusCommand implements intCommand {

    Math m;

    public minusCommand(Math m) {
        this.m = m;
    }

    @Override
    public void execute(int num1, int num2) {
        m.minus(num1, num2);
    }

}
