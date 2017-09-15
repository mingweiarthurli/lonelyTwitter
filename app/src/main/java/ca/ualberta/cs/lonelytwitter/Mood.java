package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mingwei on 2017/9/12.
 */

public abstract class Mood {

    private Date date;

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public abstract String moodIs();
}
