package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;

public class NormalTweet extends Tweet implements Serializable {

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
