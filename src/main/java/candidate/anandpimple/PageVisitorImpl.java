package candidate.anandpimple;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by anandpimple on 01/02/2017.
 */
public class PageVisitorImpl implements PageVisitor<Document> {

    @Override
    public Document extractPage(String url) throws IOException {
        return Jsoup.connect(url).get();
    }
}
