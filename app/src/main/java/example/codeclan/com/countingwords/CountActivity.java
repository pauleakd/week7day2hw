package example.codeclan.com.countingwords;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    TextView sentence_to_display;
    TextView count_to_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        Log.d(getClass().toString(), "onCreate is called");

        sentence_to_display = (TextView) findViewById(R.id.entered_text_display);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Log.d(getClass().toString(), "bundles Created");

        String sentence = extras.getString("sentence");
        Log.d(getClass().toString(), "sentence created");

        sentence_to_display.setText(sentence);

        Log.d(getClass().toString(), "sentence to display");

        int count = extras.getInt("count");

        Log.d(getClass().toString(), "count created");

        String countString = String.valueOf(count);
        Log.d(getClass().toString(), "count to string");

        count_to_display = (TextView) findViewById(R.id.count_to_display);

        count_to_display.setText(countString);

        String countHashString = extras.getString("countHash");

        count_to_display = (TextView) findViewById(R.id.count_hash_to_display);

        count_to_display.setText(countHashString);

    }
}
