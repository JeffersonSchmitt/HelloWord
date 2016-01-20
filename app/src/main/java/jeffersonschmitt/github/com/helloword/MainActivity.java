package jeffersonschmitt.github.com.helloword;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import jeffersonschmitt.github.com.helloword.business.UserServices;
import jeffersonschmitt.github.com.helloword.contracts.IUserService;
import jeffersonschmitt.github.com.helloword.domain.User;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import java.util.List;

@EActivity(R.layout.activity_main)

public class MainActivity extends Activity {

  @ViewById EditText usuario;
  @ViewById EditText senha;
  @ViewById Button entrar;
  @ViewById EditText results;

    IUserService userService;

  @AfterViews void init() {
    userService = new UserServices();
  }

  @Click void Entrar() {
    String usuarioUser = usuario.getText().toString();
    String senhaUser = senha.getText().toString();
    User user = new User(usuarioUser, senhaUser);
    userService.create(user);
      Toast.makeText(this,"Criado com Sucesso",Toast.LENGTH_SHORT).show();

  }
    @UiThread void updateResults(){
        results.setText(getResults());
    }
    String getResults(){
        List<User>users=userService.get();
        String result= "";
        for(User u :users){
            result=result+u.getUsuario()+"\n";

        }
        return result;
    }
}
