import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();
    private String app1 = "Adobe Photoshop";
    private String app2 = "Google Chrome";
    private String app3 = "IntelliJ IDEA";
    private String ext1 = ".psd";
    private String ext2 = ".html";
    private String ext3 = ".java";

    @BeforeEach
    void register() {
        manager.register(ext1, app1);
        manager.register(ext2, app2);
        manager.register(ext3, app3);
    }

    @Test
    void shouldGetApp() {
        String actual = manager.getApp(ext2);
        String expected = app2;
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveApp() {
        manager.removeApp(ext3);
        Set<String> actual = manager.getAllExtension();
        Set<String> expected = Set.of(ext1.toUpperCase(), ext2.toUpperCase());
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAllApp() {
        Set<String> actual = manager.getAllApp();
        Set<String> expected = Set.of(app1, app2, app3);
        assertEquals(expected, actual);
    }

}