package  third_day_9th.ques1;

abstract class Parent{

    void message() { }

}

class Subclass1 extends Parent{
    @Override
    void message() {
        System.out.println(" First subclass");
    }

}

class Subclass2 extends Parent{


    @Override
    void message() {
        System.out.println(" Second subclass");
    }
}

public class Ques1{

    public static void main(String args[]) {

        Subclass1 sb1 = new Subclass1();

        Subclass2 sb2 = new Subclass2();

        sb1.message();

        sb2.message();

    }

}