package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Deque {
    @Test
    public void AddFirstTest() {
        java.util.Deque ourDeque = new LinkedList<>();
        ourDeque.addFirst(1);
        Object expected = 1;
        Object actual = ourDeque.peekFirst();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AddLastTest() {
        java.util.Deque ourDeque = new LinkedList<>();
        ourDeque.addFirst(1);
        ourDeque.addLast(2);
        Object expected = 2;
        Object actual = ourDeque.peekLast();
        Assert.assertEquals(expected, actual);
    }
}
