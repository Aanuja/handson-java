package  third_day_9th.ques4;

abstract class A {
    A() {
        System.out.println("constructor of abstract class");
    }

    abstract void aMethod();

    void nonAbstract() {
        System.out.println("Normal method of abstract class");
    }
}
