package jeffersonschmitt.github.com.helloword;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import jeffersonschmitt.github.com.helloword.business.UserServices;
import jeffersonschmitt.github.com.helloword.contracts.IUserService;
import jeffersonschmitt.github.com.helloword.domain.User;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)

public class MainActivity extends Activity {

  @ViewById EditText usuario;
  @ViewById EditText senha;
  @ViewById Button entrar;

  IUserService userService;

  @AfterViews void init() {
    userService = new UserServices();
  }

  @Click void add() {
    String usuarioUser = usuario.getText().toString();
    String senhaUser = senha.getText().toString();
    User user = new User(usuarioUser, senhaUser);
  }
}
