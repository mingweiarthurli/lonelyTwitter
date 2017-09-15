package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mingwei on 2017/9/12.
 */

public class SadMood extends Mood {

    public SadMood() {
    }

    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String moodIs() {
        return "sad";
    }
}
