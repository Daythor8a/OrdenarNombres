import java.util.ArrayList;
import java.util.Collections;

public class OrdenarNombres {
    public static void main (String[]args){

        ArrayList<String> names = new ArrayList<String>();
        names.add("Raul");
        names.add("Anna");
        names.add("Carlos");
        names.add("Juan");
        names.add("Pablo");
        names.add("Edgar");
        names.add("Adriana");
        names.add("Miguel");
        names.add("Sebas");
        names.add("Gustavo");
        names.add("Alejandro");
        names.add("Brenda");
        names.add("Luis");
        names.add("Anderson");
        names.add("Douglas");
        names.add("David");
        names.add("Sion");
        names.add("Abraham");
        names.add("Leonardo");
        names.add("Nicole");
        Collections.sort(names);
        for(int i=0; i<names.size(); i++)
            System.out.println(names.get(i));
    }
}
