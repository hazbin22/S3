package com.example.new_app;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private static final String VALID_USERNAME="user";
    private static final String VALID_PASSWORD="password";

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText=findViewById(R.id.usernameEditText);
        passwordEditText=findViewById(R.id.passwordEditText);
        buttonLogin=findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredUsername=usernameEditText.getText().toString();
                String enteredPassword=passwordEditText.getText().toString();
                if (isValidCredentials(enteredUsername,enteredPassword)){
                    showToast("Login Successful.");
                }
                else{
                    showToast("Invalid Credentials!");
                }
            }
        });
    }
    private boolean isValidCredentials(String enteredUsername,String enteredPassword){
        return VALID_USERNAME.equals(enteredUsername) && VALID_PASSWORD.equals(enteredPassword);
    }
    private void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}