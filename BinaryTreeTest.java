import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class BinaryTreeTest {

    BinaryTree<Integer> T;

    @BeforeEach
    public void setUp() throws Exception {

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> arr_list = new ArrayList<>(List.of(arr));
        T = new BinaryTree<>(arr_list);

        System.out.println(T.getRoot().first());
        System.out.println(T.getRoot().last());
    }

    @Test
    public void test() {
        // DEFINE EACH TEST CASE AS A SEPARATE FUNCTION
        // CALL ALL TEST FUNCTIONS HERE
    }

}
