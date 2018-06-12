package mspring4.S_5_1.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRespositoryImpl implements UserRepository {
    @Override
    public List<User> findUser(long max, int count) {
        List<User> list=new ArrayList<>();
        int  defaut=1;
        if (max!=Long.MAX_VALUE){
            defaut=333;
        }
        for (int i = 0; i < 20; i++) {
            User user=new User();
            user.setAge(i*defaut);
            user.setName("葛晓伦"+(i*defaut));
            user.setSex(i%2==0?"男":"女");
            list.add(user);
        }
        return list;
    }
}
