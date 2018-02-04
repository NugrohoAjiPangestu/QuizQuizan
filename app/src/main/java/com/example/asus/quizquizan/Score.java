package com.example.asus.quizquizan;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class score extends AppCompatActivity {
    TextView mtvHasilAkhir;
    Button mbtnMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Score");

        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        mbtnMenu = (Button) findViewById(R.id.btnHOME);

        setSkor();

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(score.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void setSkor() {
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        mtvHasilAkhir.setText("SKOR : "+skorPilGan);
    }
}
