import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastSafe {
    public static void main(String[] args) {
        List< Integer > list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(90);

        Iterator< Integer > itr = list.iterator();
        while (itr.hasNext()) {
            Integer element = itr.next();
            if(element.equals(23))
            {
                list.remove(element);
                System.out.println(list);
            }

        }

    }
}
