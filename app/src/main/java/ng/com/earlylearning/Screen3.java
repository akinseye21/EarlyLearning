package ng.com.earlylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Screen3 extends AppCompatActivity {

    String tutor;
    RelativeLayout bg;
    ImageView imageo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bg = findViewById(R.id.bg);
        imageo = findViewById(R.id.imageo);

        Intent i = getIntent();
        tutor = i.getStringExtra("tutor");

        if (tutor.equals("chisom")){
            bg.setBackgroundResource(R.drawable.asset_26);
            imageo.setImageResource(R.drawable.asset_3);
        } else if (tutor.equals("zainab")){
            bg.setBackgroundResource(R.drawable.asset_27);
            imageo.setImageResource(R.drawable.asset_6);
        } else if (tutor.equals("ayo")){
            bg.setBackgroundResource(R.drawable.asset_25);
            imageo.setImageResource(R.drawable.asset_1);
        }
    }
}