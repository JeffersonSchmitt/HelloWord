package jeffersonschmitt.github.com.helloword.repository;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;

import java.util.List;


import jeffersonschmitt.github.com.helloword.contracts.IUserRepository;
import jeffersonschmitt.github.com.helloword.domain.User;


public class UserRepository implements IUserRepository {
    @Override
    public List<User> get() {
        return new Select().from(User.class).execute();
    }

    @Override
    public User getByUserId(int usuario) {
        return new Select().from(User.class).where("usuario=?",usuario).executeSingle();
    }

    @Override
    public void add(User user) {
        user.save();
    }

    @Override
    public void update(User user) {
        user.save();
    }

    @Override
    public void delete(int usuario) {
        new Delete().from(User.class).where("usuario=?", usuario).executeSingle();
    }
}
