package example.codeclan.com.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText TextBox;
    TextView AnswerView;
    Button AnswerButton;
    WordCount wordCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextBox = (EditText)findViewById(R.id.TextBox);
        AnswerView = (TextView)findViewById(R.id.AnswerView);
        AnswerButton = (Button)findViewById(R.id.AnswerButton);

        wordCount = new WordCount();
    }

    public String onAnswerButtonClicked(View button) {
        String words = TextBox.getText().toString();
        Log.d("Wordcount", words);
        WordCount.getWordCountInSentence;
        
        return words;
    }

}

