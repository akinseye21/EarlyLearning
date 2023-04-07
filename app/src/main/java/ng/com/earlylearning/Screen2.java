package ng.com.earlylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {

    TextView cardName1, cardName2, origin, description, close;
    ImageView imageo;
    RelativeLayout background;
    Button startLearning;
    String tutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cardName1 = findViewById(R.id.cardName);
        cardName2 = findViewById(R.id.cardName2);
        origin = findViewById(R.id.origin);
        description = findViewById(R.id.description);
        close = findViewById(R.id.close);
        background = findViewById(R.id.background);

        imageo = findViewById(R.id.imageo);
        startLearning = findViewById(R.id.startLearning);

        //get the intent from previous screen
        Intent i = getIntent();
        tutor = i.getStringExtra("tutor");

        if (tutor.equals("chisom")){
            cardName1.setText("Chisom");
            cardName2.setText("Chisom");
            origin.setText("Origin: Eastern Nigeria");
            background.setBackgroundResource(R.drawable.screen2_gradient_chisom);
            imageo.setImageResource(R.drawable.asset_chisom);
            startLearning.setBackgroundResource(R.drawable.button_chisom);
        } else if (tutor.equals("zainab")){
            cardName1.setText("Zainab");
            cardName2.setText("Zainab");
            origin.setText("Origin: Northern Nigeria");
            background.setBackgroundResource(R.drawable.screen2_gradient_zainab);
            imageo.setImageResource(R.drawable.asset_zainab);
            startLearning.setBackgroundResource(R.drawable.button_zainab);
        } else if (tutor.equals("ayo")){
            cardName1.setText("Ayo");
            cardName2.setText("Ayo");
            origin.setText("Origin: Western Nigeria");
            background.setBackgroundResource(R.drawable.screen2_gradient_ayo);
            imageo.setImageResource(R.drawable.asset_ayo);
            startLearning.setBackgroundResource(R.drawable.button_ayo);
        }

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        startLearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Screen3.class);
                i.putExtra("tutor", tutor);
                startActivity(i);
            }
        });
    }
}