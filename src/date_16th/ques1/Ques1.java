package  date_16th.ques1;

class Ques1 {
    public static void main(String[] args) throws InterruptedException {
        MyClass thread = new MyClass();
        thread.start();
        thread.interrupt();
        System.out.println("Main thread execution completes");
    }
}
