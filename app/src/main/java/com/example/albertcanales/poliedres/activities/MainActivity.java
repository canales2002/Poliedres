package com.example.albertcanales.poliedres.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.albertcanales.poliedres.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void comencat(View v) {
        EditText password = (EditText) findViewById(R.id.password);
        String contrasenya = password.getText().toString();
        TextView error = (TextView) findViewById(R.id.error);
        Intent intent = new Intent(this, MenuActivity.class);
        if (contrasenya.equals("a")) {
            error.setTextColor(Color.GREEN);
            error.setText(R.string.user_pass);
            startActivity(intent);
        } else {
            error.setTextColor(Color.RED);
            error.setText(R.string.user_deny);
        }
    }
}
