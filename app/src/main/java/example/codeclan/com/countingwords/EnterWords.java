package example.codeclan.com.countingwords;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class EnterWords extends AppCompatActivity {

    private EditText textEditText;
    private Button entertextButton;
    private Words words;
    private HashMap hash_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_words);
        Log.d(getClass().toString(), "onCreate is called");
        textEditText = (EditText) findViewById(R.id.text);
        entertextButton = (Button) findViewById(R.id.enterButton);
    }

    protected void onClickEnterTextButton(View button){
        String sentence = textEditText.getText().toString();
        Log.d(getClass().toString(), sentence);

        words = new Words(sentence);
        int words_count = words.wordCount();
        hash_count = words.countInHash();
        String hash_count_string = hash_count.toString();

        Intent intent = new Intent(this, CountActivity.class);
        intent.putExtra("sentence", sentence);
        intent.putExtra("count", words_count);
        intent.putExtra("countHash", hash_count_string);
        startActivity(intent);


    }


}
