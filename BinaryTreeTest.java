import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class BinaryTreeTest {

    BinaryTree<Integer> T;

    @Test
    public void normal_first()
    {

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> arr_list = new ArrayList<>(List.of(arr));
        T = new BinaryTree<>(arr_list);

        assertEquals(1, T.getRoot().first().data);
    }

    @Test
    public void normal_last()
    {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> arr_list = new ArrayList<>(List.of(arr));
        T = new BinaryTree<>(arr_list);

        assertEquals(9, T.getRoot().last().data);
    }

    @Test
    public void normal_nextAncestor()
    {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> arr_list = new ArrayList<>(List.of(arr));
        T = new BinaryTree<>(arr_list);

        assertEquals(null, T.getRoot().nextAncestor());
        assertEquals(null, T.getRoot().right.nextAncestor());
        assertEquals(5, T.getRoot().left.nextAncestor().data);
    }

    @Test
    public void normal_prevAncestor()
    {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> arr_list = new ArrayList<>(List.of(arr));
        T = new BinaryTree<>(arr_list);

        assertEquals(null, T.getRoot().prevAncestor());
        assertEquals(null, T.getRoot().left.prevAncestor());
        assertEquals(5, T.getRoot().right.prevAncestor().data);
    }

    @Test
    public void normal_next()
    {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> arr_list = new ArrayList<>(List.of(arr));
        T = new BinaryTree<>(arr_list);

        assertEquals("2", T.getRoot().first().next());
        assertEquals("5", T.getRoot().last().next());
    }

    @Test
    public void test() {
        // DEFINE EACH TEST CASE AS A SEPARATE FUNCTION
        // CALL ALL TEST FUNCTIONS HERE
    }

}
