package jeffersonschmitt.github.com.helloword;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clickEntrar(View view){
        AlertDialog alertDialog;
        alertDialog= new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Logado com sucesso");
        alertDialog.setMessage("Voce entrou com a sua conta");
        alertDialog.show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
