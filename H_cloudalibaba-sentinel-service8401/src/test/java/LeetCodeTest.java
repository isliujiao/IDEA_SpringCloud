import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author:厚积薄发
 * @create:2022-06-06-15:43
 */
public class LeetCodeTest {

    @Test
    public void test(){
        System.out.println(maximum(8, 2));
    }


    public int maximum(int a, int b) {
        int[] t = new int[2];
        t[0] = a;
        t[1] = b;
        Arrays.sort(t);
        return t[1];
    }

}
