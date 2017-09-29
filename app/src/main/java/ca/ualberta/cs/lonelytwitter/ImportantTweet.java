
/*
 * ImportantTweet
 *
 * Version: 1.0
 *
 * September 26, 2017
 *
 * Copyright 2017 Team x. CMPUT 301. University of Alberta. All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of he Code of Student Behavior t University of Alberta.
 * You may find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represent a important tweet which is a kind of tweet
 *
 * @author mingwei
 * @version 1.5
 * @see Tweet
 * @see NormalTweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Construct a important tweet object with system date
     *
     * @param message tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Construct a important tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Mark importance of tweet as TRUE
     *
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
