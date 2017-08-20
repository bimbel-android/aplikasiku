package dev.bimbel.aplikasiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();
    private EditText etUsername;
    private EditText etPassowrd;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        renderView();

    }


    private void renderView() {
        etUsername = (EditText)findViewById(R.id.et_username);
        etPassowrd = (EditText)findViewById(R.id.et_password);

        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionLogin();
            }
        });

    }

    private void actionLogin() {

        String username = etUsername.getText().toString();
        String password = etPassowrd.getText().toString();

        if(username.equals("") ){
            etUsername.setError("ini harus diisi");
            etUsername.requestFocus();
            return;
        }


        Log.d(TAG, "actionLogin: username =" + username);
        Log.d(TAG, "actionLogin: password = " + password);
    }

}
