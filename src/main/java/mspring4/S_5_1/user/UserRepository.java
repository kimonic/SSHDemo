package mspring4.S_5_1.user;

import java.util.List;

public interface UserRepository {
    List<User> findUser(long max, int count);
}
