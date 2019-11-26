import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecordDeck {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Sweet Jamz Deck", 45);
    }

    @Test
    public void getName(){
        assertEquals("Sweet Jamz Deck", recordDeck.getName());
    }

    @Test
    public void getPlaySpeed(){
        assertEquals(45, recordDeck.getPlaySpeed());

    }


}
