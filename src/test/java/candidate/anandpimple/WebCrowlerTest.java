package candidate.anandpimple;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by anandpimple on 01/02/2017.
 */
class WebCrowlerTest {
    private WebCrowler crowler;
    //Main Requirment is to visit and extract page data for required page.
    @Test
    public void testVisitAndExtract(){
        Map<String,List<String>> data = crowler.visitAndExtract("http://wiprodigital.com");
    }
}