import com.zhang.sort.InsertSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 * @author ZhangBro
 */
public class Application {
    private static Logger logger = LoggerFactory.getLogger("Application");

    public static void main(String[] args) {
        try {
            InsertSort selectionSort = new InsertSort();
            selectionSort.go(false, false, true, 1 << 3);
        } catch (Exception e) {
            logger.error("{}", e);
        }

    }
}