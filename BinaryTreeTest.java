import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class BinaryTreeTest {

    BinaryTree<Integer> T;

    //Normal Tests
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

        assertEquals(2, T.getRoot().first().next().data);
        assertEquals(4, T.getRoot().left.next().data);
        assertEquals(null, T.getRoot().last().next());
    }

    @Test
    public void normal_previous()
    {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> arr_list = new ArrayList<>(List.of(arr));
        T = new BinaryTree<>(arr_list);

        assertEquals(8, T.getRoot().last().previous().data);
        assertEquals(7, T.getRoot().right.previous().data);
        assertEquals(null, T.getRoot().first().previous());
    }

    //Empty Tests
    @Test
    public void empty_test()
    {
        Integer[] arr = {};
        ArrayList<Integer> arr_list = new ArrayList<>(List.of(arr));
        T = new BinaryTree<>(arr_list);

        assertEquals(null, T.getRoot());
    }

    @Test
    public void test() {
        normal_first();
        normal_last();
        normal_nextAncestor();
        normal_prevAncestor();
        normal_next();
        normal_previous();
        empty_test();

    }

}
