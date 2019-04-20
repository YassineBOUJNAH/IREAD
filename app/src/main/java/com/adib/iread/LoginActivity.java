package com.adib.iread;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

//Search books,Search books, authors, publishers…
public class LoginActivity extends AppCompatActivity {

    private EditText userMail,userPassword;
    private Button userBtn;
    private ProgressBar userPrg;
    private FirebaseAuth userAuth;
    private Intent  homeActivity;
    private TextView SignMsg;
    private TextView RestPass;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);





    }
}
