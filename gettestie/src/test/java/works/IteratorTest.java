package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    @Test
    public void TestHasNext(){
        List<String> ourList = new ArrayList<>();
        ourList.add("hotdog");
        ourList.add("hamburger");
        ourList.add("taco");

        StringBuilder sb = new StringBuilder();
        Iterator iterator =  ourList.iterator();
        while(iterator.hasNext()) {
            sb.append(iterator.next());
        }
        String expected = "hotdoghamburgertaco";
        String actual = sb.toString();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestRemove(){
        List<String> ourList = new ArrayList<>();
        ourList.add("hotdog");
        ourList.add("hamburger");
        ourList.add("taco");

//        StringBuilder sb = new StringBuilder();
        String current = "";
        Iterator iterator =  ourList.iterator();
        while(iterator.hasNext()) {
            current = iterator.next().toString();
            if(current.equals("hamburger")){
                iterator.remove();
                break;
            }
        }


        String expected = "hamburger";
        String actual = current;
        Assert.assertEquals(expected,actual);

    }
}
