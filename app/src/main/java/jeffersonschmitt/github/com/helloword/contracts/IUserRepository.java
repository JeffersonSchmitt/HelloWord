package jeffersonschmitt.github.com.helloword.contracts;

import java.util.List;

import jeffersonschmitt.github.com.helloword.domain.User;


public interface IUserRepository {
    List<User> get();
    User getByUserId(int usuario);
    void add(User user);
    void update(User user);
    void delete (String id);
}
