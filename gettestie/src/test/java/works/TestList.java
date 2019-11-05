package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    @Test
    public void TestAdd(){
        List<Integer> intList = new ArrayList<>();
        Integer ten = 10;
        intList.add(ten);
        Boolean expected = true;
        Boolean actual = intList.contains(ten);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestRemove(){
        List<Integer> intList = new ArrayList<>();
        Integer ten = 10;
        Integer eleven = 11;
        intList.add(ten);
        intList.add(eleven);
        intList.remove(eleven);
        Boolean expected = true;
        Boolean actual = intList.contains(ten);

        Assert.assertEquals(expected,actual);
    }
}
