package com.example.cobapertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_corona);
        btnMoveActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Corona.class);
                startActivity(intent);
            }
        });

        Button btnMoveActivity1 = findViewById(R.id.btn_move_pencegahan);
        btnMoveActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pencegahan = new Intent(MainActivity.this, Pencegahan.class);
                startActivity(pencegahan);
            }
        });

        Button btnMoveDial = findViewById(R.id.btn_move_contact);
        btnMoveDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "(024)3580713";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
            }
        });
    }
}
