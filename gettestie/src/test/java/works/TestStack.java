package works;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void TestPush(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        int expected = 1;
        int actual = stack.size();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestPeek(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        int expected = 1;
        int actual = stack.peek();

        Assert.assertEquals(expected,actual);
    }
    // Make a bigger test exercising more Stack methods.....
}
