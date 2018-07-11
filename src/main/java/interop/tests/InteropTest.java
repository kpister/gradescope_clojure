package interop.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import jh61b.grader.GradedTest;

import interop.Interop;

public class InteropTest {
    @Test
    @GradedTest(name="Test clojure function", max_score=1)
    public void test_clojure() {
        long test = Interop.nthFib(3);
        assertEquals(test, 3);
    }
}
