import mspring4.S_4_1.AudienceConfig;
import mspring4.S_4_1.Performance;
import mspring4.s12.SrudentConfig;
import mspring4.s12.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AudienceConfig.class,SrudentConfig.class})
public class TestS41 {

    @Autowired
    private Performance performance;

    @Autowired
    private Student student;

    @Test
    public void cdShouldNotNull() {
        Assert.assertNotNull(student);
    }


    @Test
    public void check(){
        try {
            performance.perform(10);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
