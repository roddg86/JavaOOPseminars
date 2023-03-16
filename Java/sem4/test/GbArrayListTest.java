package sem4.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sem4.gb.array.list.GBArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GbArrayListTest {

    @Test
    void getTest(){
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        assertEquals("1",strings.get(0));

    }
    @Test
    void getNegativeTest(){
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        assertNotEquals("2",strings.get(0));

    }
}
