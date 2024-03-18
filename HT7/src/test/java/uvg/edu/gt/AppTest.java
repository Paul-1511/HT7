package uvg.edu.gt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testInsert() {
        BinaryTree<Association<String, String>> dictionary = new BinaryTree<>(new Association<>("house", "casa"));
        dictionary.insert(new Association<>("dog", "perro"));
        Association<String, String> result = dictionary.search(new Association<>("dog", ""));
        assertNotNull(result);
        assertEquals("perro", result.value);
    }

    @Test
    public void testSearch() {
        BinaryTree<Association<String, String>> dictionary = new BinaryTree<>(new Association<>("house", "casa"));
        dictionary.insert(new Association<>("dog", "perro"));
        Association<String, String> result = dictionary.search(new Association<>("cat", ""));
        assertNull(result);
    }
}

