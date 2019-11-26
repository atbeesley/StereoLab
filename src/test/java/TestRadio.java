import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestRadio {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio( "");
    }

    @Test
    public void canTuneIn(){
        radio.tuneInTo("BBC Radio 2");
        assertEquals("BBC Radio 2", radio.getChannel());
    }





}
