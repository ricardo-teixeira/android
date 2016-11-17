package br.com.ricardoteixeira.ribbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;

import java.util.HashMap;
import java.util.Map;

public class SignUpActivity extends AppCompatActivity {

    private Button mSignUpButton;
    private EditText mUsernameField;
    private EditText mPasswordField;
    private EditText mEmailField;
    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mRef = new Firebase("https://ribbit-cdb41.firebaseio.com/");
        mSignUpButton = (Button) findViewById(R.id.signupButton);
        mUsernameField = (EditText) findViewById(R.id.usernameField);
        mPasswordField = (EditText) findViewById(R.id.passwordField);
        mEmailField = (EditText) findViewById(R.id.emailField);

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Firebase usersRef = mRef.child("users");

                String name = mUsernameField.getText().toString();
                String password = mPasswordField.getText().toString();
                String email = mEmailField.getText().toString();

                Map<String, User> users = new HashMap<String, User>();
                users.put(name, new User(name, password, email));

                usersRef.setValue(users);

                Toast.makeText(SignUpActivity.this, "Saved", Toast.LENGTH_LONG).show();
            }
        });

    }
}
