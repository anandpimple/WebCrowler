package candidate.anandpimple;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by anandpimple on 01/02/2017.
 */
public class WebCrowlerImpl implements WebCrowler {
    Predicate<String> isBlankOrNull = value -> null == value || value.trim().isEmpty();
    public Map<String, List<String>> visitAndExtract(String link) {
        if (isBlankOrNull.test(link)) throw new IllegalArgumentException("Link cant be null");
        return null;
    }
}
