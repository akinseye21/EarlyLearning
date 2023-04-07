package ng.com.earlylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class Screen1 extends AppCompatActivity {

    RelativeLayout cardZainab, cardChisom, cardAyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cardZainab = findViewById(R.id.cardZainab);
        cardZainab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Screen2.class);
                i.putExtra("tutor", "zainab");
                startActivity(i);
            }
        });
        cardChisom = findViewById(R.id.cardChisom);
        cardChisom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Screen2.class);
                i.putExtra("tutor", "chisom");
                startActivity(i);
            }
        });
        cardAyo = findViewById(R.id.cardAyo);
        cardAyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Screen2.class);
                i.putExtra("tutor", "ayo");
                startActivity(i);
            }
        });
    }
}