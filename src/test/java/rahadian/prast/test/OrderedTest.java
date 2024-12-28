package rahadian.prast.test;

import org.junit.jupiter.api.*;

/**
 * @Author ian
 * @create 27/12/24 20.04
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    private int count = 0;

    @Test
    @Order(1)
    void test3() {
        count++;
        System.out.println(count);
    }

    @Test
    @Order(2)
    void test2() {
        count++;
        System.out.println(count);
    }

    @Test
    @Order(3)
    void test1() {
        count++;
        System.out.println(count);
    }
}
