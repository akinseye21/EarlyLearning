package ng.com.earlylearning.LandingPages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import ng.com.earlylearning.Maths.MathScreen;
import ng.com.earlylearning.R;

public class Screen3 extends AppCompatActivity {

    String tutor;
    RelativeLayout bg;
    ImageView imageo;
    RelativeLayout math, literacy, shapes, drawing, rhymes, coding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bg = findViewById(R.id.bg);
        imageo = findViewById(R.id.imageo);
        math = findViewById(R.id.math);
        literacy = findViewById(R.id.literacy);
        shapes = findViewById(R.id.shapes);
        drawing = findViewById(R.id.drawing);
        coding = findViewById(R.id.coding);
        rhymes = findViewById(R.id.rhymes);

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

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MathScreen.class);
                i.putExtra("tutor", tutor);
                startActivity(i);
            }
        });
    }
}