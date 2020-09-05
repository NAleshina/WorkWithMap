package ru.netology;

import java.util.*;

public class FileOpenManager {

    Map<String, String> applicationAndExtension = new TreeMap<>();

    public void register(String extension, String app) {
        applicationAndExtension.put(extension.toUpperCase(), app);
    }

    public String getApp(String extension) {
        return applicationAndExtension.get(extension.toUpperCase());
    }

    public void removeApp(String extension) {
        applicationAndExtension.remove(extension.toUpperCase());
    }

    public Set<String> getAllExtension() {
        Set<String> result = new TreeSet<>(Comparator.naturalOrder());
        result.addAll(applicationAndExtension.keySet());
        return result;
    }

    public Set<String> getAllApp() {
        return new TreeSet<>(applicationAndExtension.values());
    }
}
