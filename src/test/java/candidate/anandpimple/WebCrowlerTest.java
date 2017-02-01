package candidate.anandpimple;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by anandpimple on 01/02/2017.
 */
class WebCrowlerTest {
    private WebCrowler crowler;

    @BeforeEach
    public void setUp(){
        crowler = new WebCrowlerImpl();
    }

    @AfterEach
    public void tearDown(){
        crowler = null;
    }
    //Main Requirment is to visit and extract page data for required page.
    @Test
    public void testVisitAndExtractNullDataPassed(){
        try {
            crowler.visitAndExtract(null);
            assertFalse(true,"Should throw IllegalArgumentException");
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }

    }
    @Test
    public void testVisitAndExtractEmptyDataPassed(){
        try {
            crowler.visitAndExtract("   ");
            assertFalse(true,"Should throw IllegalArgumentException");
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }

    }
}