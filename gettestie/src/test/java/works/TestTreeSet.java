package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {
    @Test
    public void TestPollFirst(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        Integer expected = 1;
        Integer actual = set.pollFirst();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void ClearTest(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(5);
        set.clear();
        int expected =0;
        int actual = set.size();
        Assert.assertEquals(expected,actual);
    }
}
