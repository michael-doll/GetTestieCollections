package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {

    @Test
    public void AddTest() {
        Queue<Integer> ourQueue = new PriorityQueue<>();
        ourQueue.add(1);
        int expected = 1;
        int actual = ourQueue.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void ElementTest() {
        Queue<Integer> ourQueue = new PriorityQueue<>();
        ourQueue.add(1);
        int expected = 1;
        int actual = ourQueue.element();
        Assert.assertEquals(expected, actual);
    }
}
