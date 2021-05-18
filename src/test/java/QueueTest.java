import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private final QueueImpl builder  = new QueueImpl();
    private final  ArrayList<String> lister = new ArrayList<>(List.of("goku", "Vegeta", "Napa","Picola"));

    @Test
    void removeQueue() {
        Queue q = new QueueImpl();

        ArrayList<String> actual = q.removeQueue(lister);
        ArrayList<String> expected = new ArrayList<>(List.of( "Vegeta", "Napa","Picola"));

        assertEquals(expected,actual);
    }


    @Test
    void addQueue() {
        Queue q = new QueueImpl();

        ArrayList<String> actual = q.addQueue("test");
        ArrayList<String> expected = new ArrayList<>(List.of( "test"));

        assertEquals(expected,actual);

    }

    @Test
    void showFirst() {


            Queue q = new QueueImpl();

            String actual = q.showFirst(lister);
           String expected =  "goku";

            assertEquals(expected,actual);


    }

    @Test
    void showlast() {
        Queue q = new QueueImpl();

        String actual = q.showlast(lister);
        String expected =  "Picola";

        assertEquals(expected,actual);


    }

    @Test
    void checkCapacity() {
        Queue q = new QueueImpl();

        String actual = q.checkCapacity(lister);
        String expected =  "The Queue has (4) elements.";

        assertEquals(expected,actual);

    }

}