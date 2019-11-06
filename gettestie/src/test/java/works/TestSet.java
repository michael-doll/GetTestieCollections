package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestSet {
    @Test
    public void AddTest(){
        HashSet<String> set = new HashSet<>();
        set.add("apple" );
        String expected = "apple";
        HashSet<String> actual = set;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void ClearTest(){
    HashSet<String> set = new HashSet<>();
    set.add("apple" );
    set.clear();
    int expected =0;
    int actual = set.size();
    Assert.assertEquals(expected,actual);
}
}

