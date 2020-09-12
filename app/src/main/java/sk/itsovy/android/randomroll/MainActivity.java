package sk.itsovy.android.randomroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonRoll = findViewById(R.id.buttonRoll);
    }

    public void roll(View view) {
        Random r = new Random();
        int number = r.nextInt(6) + 1;
        buttonRoll.setText("" + number);

    }
}