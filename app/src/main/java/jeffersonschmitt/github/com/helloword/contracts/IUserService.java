package jeffersonschmitt.github.com.helloword.contracts;

import java.util.List;

import jeffersonschmitt.github.com.helloword.domain.User;

public interface IUserService {
    List<User> get();
    User getByUser(int usuario);
    void changeSenha(String senha,int usuario);
    void remove(int usuario);
}
