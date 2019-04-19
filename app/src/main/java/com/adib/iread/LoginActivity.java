package com.adib.iread;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//Search books,Search books, authors, publishers…
public class LoginActivity extends AppCompatActivity {
    TextView signAct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signAct = findViewById(R.id.log_signup);
        signAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(sign);

            }
        });
    }
}
