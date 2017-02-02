package candidate.anandpimple;

/**
 * Created by anandpimple on 01/02/2017.
 */
public interface PageVisitor<O> {
    O extractPage(String url) throws Exception;
}
