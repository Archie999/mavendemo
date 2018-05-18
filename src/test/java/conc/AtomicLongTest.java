package conc;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Archie on 2018/5/15.
 *
 */
public  class AtomicLongTest {

    private final AtomicLong count = new AtomicLong(0);

    public  long getCount(){
        return count.get();
    }

    public void count(){
        count.incrementAndGet();
    }

    @Test
    public  void test() {
        for(int i=0;i<=5;i++){
            count();
        }
        System.out.println(count.get());
    }
}
