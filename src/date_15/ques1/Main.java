package  date_15.ques1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        Developer developer1=new Developer(1,"Kit",5,10000);
        Developer developer2=new Developer(2,"Kat",2,34000);
        Developer developer3=new Developer(3,"Kitty",1,3000);
        Developer developer4=new Developer(4,"King",0,24000);
        Developer developer5=new Developer(5,"Raju",3,29000);
        Developer developer6=new Developer(6,"Mani",5,34000);
        Developer developer7=new Developer(6,"Pint",5,30000);
        ArrayList<Developer> developers=new ArrayList<>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer4);
        developers.add(developer5);
        developers.add(developer6);
        developers.add(developer7);

        System.out.println("Sorting By Experience");
        Collections.sort(developers,new byExp());
        System.out.println(developers);

        System.out.println("Sorting By Salary");
        Collections.sort(developers,new bySal());
        System.out.println(developers);

        System.out.println("Sorting By Name");
        Collections.sort(developers);
        System.out.println(developers);



    }




}
