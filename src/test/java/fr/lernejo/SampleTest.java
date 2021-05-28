package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void Test_fact_simple() {
        Sample sample = new Sample();
        int res = sample.fact(0);
        Assertions.assertEquals(1, res);
    }

    @Test
    void Test_fact_error() {
        Sample sample = new Sample();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sample.fact(-1);});
    }

    @Test
    void test_add_simple() {
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.ADD, 1, 2);
        Assertions.assertEquals(3, res);
    }

    @Test
    void test_mult_simple() {
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.MULT, 1, 2);
        Assertions.assertEquals(2, res);
    }
}
