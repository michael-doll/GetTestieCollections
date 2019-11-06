package works;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
    @Test
    public void TestComp(){
        Person p1 = new Person("Apple", 1901);
        Person p2 = new Person("Franken", 1918);
        Person p3 = new Person("Fido", 2015);

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(p2);
        peopleList.add(p1);
        peopleList.add(p3);

        Collections.sort(peopleList);
        Person expected = p1;
        Person actual = peopleList.get(0);

        Assert.assertEquals(expected,actual);
    }
}
