
/*
 * NormalTweet
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
 * Represent a normal tweet which is a kind of tweet
 *
 * @author mingwei
 * @version 1.5
 * @see Tweet
 * @see ImportantTweet
 * @since 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * Construct a normal tweet object with system date
     *
     * @param message tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Construct a normal tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Mark importance of tweet
     *
     * @return return FALSE
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
