import com.laizuqi.DateUtil;
import org.junit.Test;

import java.text.ParseException;

/**
 * Created by Archie on 2018/5/9.
 */
public class StringToByteTest {

    @Test
    public void testStringToByte() throws ParseException {
       String ss = "teaafasdfa";
       byte[] bytes = ss.getBytes();
       System.out.println(bytes);
       String aa = new String(bytes);
        System.out.println(aa);

    }
}
