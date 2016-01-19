package jeffersonschmitt.github.com.helloword.business;
import java.util.List;
import jeffersonschmitt.github.com.helloword.contracts.IUserRepository;
import jeffersonschmitt.github.com.helloword.contracts.IUserService;
import jeffersonschmitt.github.com.helloword.domain.User;
import jeffersonschmitt.github.com.helloword.repository.UserRepository;

public class UserServices implements IUserService {

    private IUserRepository _userRepository;

    public UserServices() {
        _userRepository = new UserRepository();
    }

    @Override
    public List<User> get() {
        return _userRepository.get();
    }

    @Override
    public User getByUser(int usuario) {
        return _userRepository.getByUserId(usuario);
    }
    @Override
    public void changeSenha(String senha) {
        this.changeSenha(senha);
    }
    @Override
    public void create(int usuario, User user) {
        _userRepository.add(user);
    }

    @Override
    public void remove(int usuario) {
        _userRepository.delete(usuario);
    }
}

