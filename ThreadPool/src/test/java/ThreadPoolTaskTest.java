import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * @author REIGE
 * @date 2018/1/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-threadpool.xml"})
public class ThreadPoolTaskTest {

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Test
    public void test(){

        for (int i = 0;i<=100;i++){
            final int finalI = i;
            threadPoolTaskExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("测试"+ finalI);
                }
            },300);
        }

        /*使用单元测试
          java.lang.InterruptedException: sleep interrupted异常
          原因是因为单元测试启动的主线程很快就结束了，而子线程确sleep10秒
          使得主线程强行打断子线程的sleep,因此抛出异常，解决办法是可以在单元测试的最后加上sleep(10*1000),
          目的是不让主线程在子线程前结束。*/
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
