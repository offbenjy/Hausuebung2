import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    public List<String> listString = new ArrayList<String>();


    public HalloJavamitForEach() {
        listString.add("Hallo");
        listString.add("Mein Name ist Benjy");
    }
    public void printList()
    {
        for (String listS: listString) {
            System.out.println(listS);
        }
        System.out.println("_________________________________");

        listString.forEach((String s) ->System.out.println(s));

        System.out.println("_________________________________");

        listString.forEach(System.out ::println);
    }

}
