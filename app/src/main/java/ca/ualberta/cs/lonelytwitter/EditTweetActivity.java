package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private NormalTweet tweet;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        tweet = (NormalTweet) getIntent().getSerializableExtra("tweet");

        text = (TextView) findViewById(R.id.textView);
        text.setText(tweet.getMessage());

    }
}
