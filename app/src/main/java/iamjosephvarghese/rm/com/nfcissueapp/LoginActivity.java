package iamjosephvarghese.rm.com.nfcissueapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText loginId;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login);
        loginId = findViewById(R.id.firstName);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loginId.getText().toString().equals("")){
                    Snackbar.make(findViewById(R.id.rootView),"Enter Login Id", Snackbar.LENGTH_SHORT).show();
                }else if (password.getText().toString().equals("")){
                    Snackbar.make(findViewById(R.id.rootView),"Enter Password", Snackbar.LENGTH_SHORT).show();
                }
                else if (loginId.getText().toString().equals("abcd") && password.getText().toString().equals("1234") ){
                    Intent intent = new Intent(LoginActivity.this,Home.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Snackbar.make(findViewById(R.id.rootView),"Invalid Username or Password", Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}
