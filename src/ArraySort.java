import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by tkanc on 9/22/2017.
 */
public class ArraySort {
    public static void main(String [] args) {

        ArrayList lists = new ArrayList();
        lists.add(5);
        lists.add(2);
        lists.add(7);

        System.out.print(lists);

        System.out.println();
        Person []list = {new Person("David", new Date(100,6,6)),new Person("Hung",new Date(96,1,1)),new Person("John",new Date(101, 8,18))};
        for(Person x:list)
            System.out.print(x +"\t");
        Arrays.sort(list);
        System.out.println();
        for(Person x:list)
            System.out.print(x+"\t");

    }
}
