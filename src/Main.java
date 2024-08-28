import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> musicSet = createHashSet();
        String elementVerify = "Bass";
        boolean exist = musicSet.contains(elementVerify);
        if (exist) {
            System.out.println(elementVerify + " esiste nel Set");
        } else {
            System.out.println(elementVerify + " non esiste nel Set");
        }
    }
    public static Set<String> createHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Guitar");
        set.add("Bass");
        set.add("Drum");
        set.add("Keyboard");
        return set;
    }
}