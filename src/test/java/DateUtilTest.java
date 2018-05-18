import com.laizuqi.DateUtil;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by Archie on 2018/5/9.
 * 时间工具类测试
 * http://www.runoob.com/java/java-date-time.html
 */
public class DateUtilTest {

    @Test
    public void testStringTOdate() throws ParseException {
        String str = "2018-05-09 20:40";
        System.out.println(DateUtil.stringToDate(str,"YYYY-MM-DD HH:mm"));
        System.out.println(DateUtil.formatDate(str,"yyyy年MM月dd日  hh时mm分ss秒"));
        printDate();

    }

    /**
     * 自定义输出格式
     */
    public void printDate(){
        // 初始化 Date 对象
        Date date = new Date();

        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);
    }
}
