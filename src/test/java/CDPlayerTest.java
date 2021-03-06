import mspring4.s13.CDPlayerConfig;
import mspring4.s11.CompactDisc;
import mspring4.s12.SrudentConfig;
import mspring4.s12.Student;
import mspring4.s13.MediaPlayer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 光盘接口,spring自动装配示例接口--04
 * CompactDisc的测试类,使用单元测试junit
 * 单元测试版本必须在4.12及以上
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class,SrudentConfig.class})
public class CDPlayerTest {
    //https://stefanbirkner.github.io/system-rules/download.html
    //system-rules-1.18.0.jar下载地址
    //StandardOutputStreamLog已弃用,使用SystemOutRule代替
   @Rule
   public final SystemOutRule log=new SystemOutRule();

   @Autowired
   private MediaPlayer player;
//
    @Autowired
    private CompactDisc cd;

    @Autowired
    private Student student;

    @Test
    public void cdShouldNotNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void play(){
        //注意Windows系统下换行是/r/n回车换行--CRLF
        //linux下是\n换行--LF
        //intelliJ中设置方式--file-->settings-->code style-->line separator中设置
        System.out.println("--------------"+player);
        System.out.println("--------------"+cd);
        log.enableLog();//必须调用代码后才能log.getLog()才能获取到内容
        player.play();
        Assert.assertEquals("playing 亦筝笙 by 小土豆\r\n",log.getLog());
//        log.clearLog();
    }
}
