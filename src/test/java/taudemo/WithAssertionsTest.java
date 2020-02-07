package taudemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithAssertionsTest {

    @Test
    public void firstAssertion() {
        assertEquals(2, 2);
    }

    @Test
    public void secondAssertion() {
        assertEquals(45, 45);
    }

}

//1.I will create another test — this time I'm going to create a simple test that does not have any Selenium in it.
//2.I just want to show you how to run a mixture of test classes and test methods.
//3.I will just create a new class and I'm going to call it “WithAssertionsTest” because
// this is going to be a test class where I will just create some assertions. I don't want any other things to be created.