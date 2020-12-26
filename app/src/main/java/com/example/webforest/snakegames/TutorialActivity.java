package com.example.webforest.snakegames;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TutorialActivity extends AppCompatActivity {
    Button tBtnHuongDan, tBtnChoiGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        anhxa();
        tBtnChoiGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TutorialActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

    private void anhxa() {
        tBtnHuongDan = findViewById(R.id.btnHuongDan);
        tBtnChoiGame = findViewById(R.id.btnChoiGame);

    }
}
