import dnu.lab04BTS.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class BinarySearchTreeTest {
    private BinarySearchTree bst;
    private Map<Integer, String> data;

    @BeforeEach
    public void setUp() {
        bst = new BinarySearchTree();
        data = new LinkedHashMap<>();

        List<Integer> keys = new ArrayList<>();
        for (int i = 11; i <= 30; i++) {
            keys.add(i);
        }

        Collections.shuffle(keys);

        for (Integer key : keys) {
            data.put(key, "Value " + key);
        }
    }


    @Test
    public void testCase1() {
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            bst.insert(entry.getKey(), entry.getValue());
        }

        int bstSize = bst.size();

        assertEquals(data.size(), bstSize, "The size of the binary search tree is not correct.");
    }

    @Test
    public void testCase2() {
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            bst.insert(entry.getKey(), entry.getValue());
        }

        String value15 = bst.search(15);
        assertEquals("Value 15", value15, "The value of the key 15 was not retrieved correctly.");

        String value30 = bst.search(30);
        assertEquals("Value 30", value30, "The value of the key 30 was not retrieved correctly.");

        String nullValue = bst.search(31);
        assertNull(nullValue, "The value of the key 31 should be null");
    }

    @Test
    public void testCase3() {
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            if (entry.getKey() != 15) {
                bst.insert(entry.getKey(), entry.getValue());
            }
        }

        String nullValue = bst.search(15);
        assertNull(nullValue, "The value of the key 15 should be null");

        bst.insert(15, "New Value 15");
        String newValue15 = bst.search(15);
        assertEquals("New Value 15", newValue15, "The value of the key 15 was not retrieved correctly.");

        bst.insert(15, "Updated Value 15");
        String updatedValue15 = bst.search(15);
        assertEquals("Updated Value 15",updatedValue15,"The value of the key 15 was not updated correctly.");
    }

    @Test
    public void testCase4() {
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            bst.insert(entry.getKey(), entry.getValue());
        }

        bst.delete(20);
        int bstSize = bst.size();
        assertEquals(data.size() - 1, bstSize, "The size of the binary search tree is not correct after deletion.");

        String nullValue = bst.search(20);
        assertNull(nullValue, "The value of the key 20 should be null after deletion");
    }
}