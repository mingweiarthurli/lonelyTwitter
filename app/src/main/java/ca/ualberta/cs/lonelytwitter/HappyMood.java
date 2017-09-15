package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mingwei on 2017/9/12.
 */

public class HappyMood extends Mood {

    public HappyMood() {
    }

    public HappyMood(Date date) {
        super(date);
    }

    @Override
    public String moodIs() {
        return "happy";
    }

}
