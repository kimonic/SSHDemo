import mspring4.S_5_1.web.HomeCtroller;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControlerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeCtroller homeCtroller=new HomeCtroller();
        MockMvc mockMvc=MockMvcBuilders.standaloneSetup(homeCtroller).build();
        mockMvc.perform(get("/homepage")).andExpect(view().name("home"));
//        Assert.assertEquals("home",homeCtroller.home());
    }
}
