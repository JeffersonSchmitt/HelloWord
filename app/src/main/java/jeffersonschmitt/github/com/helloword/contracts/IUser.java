package jeffersonschmitt.github.com.helloword.contracts;

import java.util.List;

import jeffersonschmitt.github.com.helloword.domain.User;

/**
 * Created by Mitt on 18/01/2016.
 */
public interface IUser {
    List<User> get();
    User getByUserId(int usuario);
    void add(User user);
    void update(User user);
    void delete (int id);
}
