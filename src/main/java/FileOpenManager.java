
import java.util.*;

public class FileOpenManager {

    Map<String, String> applicationAndExtension = new TreeMap<>();

    public String register(String extension, String app) {
        extension = extension.toUpperCase();
        return applicationAndExtension.put(extension, app);
    }

    public String getApp(String extension) {
        extension = extension.toUpperCase();
        return applicationAndExtension.get(extension);
    }

    public void removeApp(String extension) {
        extension = extension.toUpperCase();
        applicationAndExtension.remove(extension);
    }

    public Set<String> getAllExtension() {
        Set<String> result = new TreeSet<String>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        result.addAll(applicationAndExtension.keySet());
        return result;
    }

    public Set<String> getAllApp() {
        Set<String> result = new TreeSet<String>(applicationAndExtension.values());
        return result;
    }
}
