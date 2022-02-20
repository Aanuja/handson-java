package  second_day_8th.ques1;

class Sources extends proteins {
    public Sources() {
        System.out.println("Milk  is a source of protein");
    }

    public Sources(String source2) {
        this();
        System.out.println(source2 + " is also a great source of protein");
    }

    public Sources(String source2, String source3) {
        this(source2);
        System.out.println(source3 + " is also a great source of protein");
        displayBenefits();
    }

}
