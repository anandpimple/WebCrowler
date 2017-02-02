package candidate.anandpimple;

import java.util.List;
import java.util.Map;

/**
 * Created by anandpimple on 01/02/2017.
 */
public interface WebCrowler {
    Map<String,List<String>> visitAndExtract(String s) throws Exception;
}
