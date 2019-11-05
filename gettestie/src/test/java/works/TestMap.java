package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.HashMap;

public class TestMap {
    @Test
    public void TestContains(){
       Map<Integer,String> map = new HashMap<>();
       Integer one = 1;
       String apple = "apple";
       Integer two = 2;
       String banana = "banana";
       map.put(one,apple);
       map.put(two,banana);
        Boolean expected = true;
        Boolean actual = map.containsValue(banana);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestRemove(){
        Map<Integer,String> map = new HashMap<>();
        Integer one = 1;
        String apple = "apple";
        Integer two = 2;
        String banana = "banana";
        map.put(one,apple);
        map.put(two,banana);
        map.remove(two);
        Boolean expected = false;
        Boolean actual = map.containsValue(banana);

        Assert.assertEquals(expected,actual);
    }
}
