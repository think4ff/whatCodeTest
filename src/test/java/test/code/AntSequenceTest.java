package test.code;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class AntSequenceTest extends TestCase {

    public AntSequenceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AntSequenceTest.class);
    }

    public void testAntSequence() {
        assertThat(AntSequence.goAnt(1), is("1"));// 1,
        assertThat(AntSequence.goAnt(2), is("11"));// 2,
        assertThat(AntSequence.goAnt(3), is("12"));// 3,
        assertThat(AntSequence.goAnt(4), is("1121"));// 4,
        assertThat(AntSequence.goAnt(5), is("122111"));// 5,
        assertThat(AntSequence.goAnt(6), is("112213"));// 6,

        System.out.println(AntSequence.goAnt(10));
    }

}
