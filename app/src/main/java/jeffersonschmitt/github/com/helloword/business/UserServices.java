package jeffersonschmitt.github.com.helloword.business;


import java.util.List;

import jeffersonschmitt.github.com.helloword.contracts.IUser;
import jeffersonschmitt.github.com.helloword.contracts.IUserService;
import jeffersonschmitt.github.com.helloword.domain.User;
import jeffersonschmitt.github.com.helloword.repository.UserRepository;

public class UserServices implements IUserService {

    private IUser _User;

    public UserServices(IUser _IUser) {
        _IUser =new UserRepository();
    }

    @Override
    public List<User> get() {
        return _User.get();
    }

    @Override
    public User getByUser(int usuario) {
        return _User.getByUserId(usuario);
    }

    @Override
    public void changeSenha(String senha,int usuario) {
        User user= getByUser(usuario);
        user.changeSenha(senha);
        _User.update(user);
    }

    @Override
    public void remove(int usuario) {
        _User.delete(usuario);
    }
}
