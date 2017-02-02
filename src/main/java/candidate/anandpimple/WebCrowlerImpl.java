package candidate.anandpimple;

import org.jsoup.nodes.Document;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by anandpimple on 01/02/2017.
 */
public class WebCrowlerImpl implements WebCrowler {
    private final Predicate<String> isBlankOrNull = value -> null == value || value.trim().isEmpty();
    private PageVisitor<Document> pageVisitor;
    public Map<String, List<String>> visitAndExtract(String link) throws Exception {
        if(null == pageVisitor) throw new IllegalStateException("Set page visitor");
        if (isBlankOrNull.test(link)) throw new IllegalArgumentException("Link can't be null");
        Document document = pageVisitor.extractPage(link);
        if(null == document || !document.baseUri().equalsIgnoreCase(link)){
            throw new IllegalAccessException("Page "+link+" not found");
        }
        return null;
    }

    public PageVisitor getPageVisitor() {
        return pageVisitor;
    }

    public void setPageVisitor(PageVisitor pageVisitor) {
        this.pageVisitor = pageVisitor;
    }
}
