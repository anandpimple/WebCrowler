package candidate.anandpimple;

import org.jsoup.nodes.Document;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by anandpimple on 01/02/2017.
 */
class WebCrowlerTest {
    private WebCrowlerImpl crowler;
    @BeforeEach
    public void setUp(){
        crowler = new WebCrowlerImpl();
        crowler.setPageVisitor(new PageVisitorImpl());
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
        }catch(Exception e){
            assertTrue(e instanceof IllegalArgumentException);
        }

    }
    @Test
    public void testVisitAndExtractEmptyDataPassed(){
        try {
            crowler.visitAndExtract("   ");
            assertFalse(true,"Should throw IllegalArgumentException");
        }catch(Exception e){
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testVisitAndExtractProperLinkNullVisitor(){
        try {
            crowler.setPageVisitor(null);
            crowler.visitAndExtract("www.google.com");
            assertFalse(true,"Should throw IllegalStateException");
        }catch(Exception e){
            assertTrue(e instanceof IllegalStateException);
        }
    }

    @Test
    public void testVisitAndExtractImproperLink(){
        try {
            crowler.visitAndExtract("testlink");
            assertFalse(true,"Should throw MalformedURLException");
        }catch(Exception e){
            assertTrue(e instanceof IllegalArgumentException);
            assertTrue(((IllegalArgumentException)e).getCause() instanceof  MalformedURLException);
        }
    }

    // This test is failing at my local env. as my provider return search page and from
    // jsoup, it is difficult to understand it.
    @Test
    public void testVisitAndExtractPageNotFound(){
        try {
            crowler.visitAndExtract("http://wwww.pagesasasasasasaa.com");
            assertFalse(true,"Should throw IllegalAccessException");
        }catch(Exception e){
            assertTrue(e instanceof IllegalAccessException);

        }
    }

    @Test
    public void testVisitAndExtractPageFound(){
        try {
            crowler.visitAndExtract("http://wiprodigital.com");
            assertTrue(true);
        }catch(Exception e){
            assertFalse(true,"Shouldn't throw Exception");
        }
    }
}