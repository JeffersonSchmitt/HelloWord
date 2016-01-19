package jeffersonschmitt.github.com.helloword.repository;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;

import java.util.List;


import jeffersonschmitt.github.com.helloword.domain.User;
import jeffersonschmitt.github.com.helloword.contracts.IUser;


public class UserRepository implements IUser {
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
