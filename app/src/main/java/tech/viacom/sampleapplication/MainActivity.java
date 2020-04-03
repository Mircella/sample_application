package tech.viacom.sampleapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    Button button;

    List<Integer> colors = Arrays.asList(R.color.red, R.color.orange, R.color.yellow, R.color.green, R.color.blue, R.color.dark_blue, R.color.violet);
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.tv_1);
        text2 = findViewById(R.id.tv_2);
        text3 = findViewById(R.id.tv_3);
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setBackgroundResource(R.color.colorAccent);
                setColors(text1, text2, text3);
            }
        });
    }

    void setColors(TextView... textViews) {
        for (int i = 0; i < textViews.length; i++) {
            int colorIndex = (counter + i) % colors.size();
            textViews[i].setBackgroundResource(colors.get(colorIndex));
        }
        counter++;
    }
}
