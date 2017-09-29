

/*
 * Tweet
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
 * Represent a tweet
 *
 * @author mingwei
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet {

    private String message;
    private Date date;

    /**
     * Construct a tweet object with system date
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Query importance of tweet
     *
     * @return TRUE or FALSE
     */
    public abstract Boolean isImportant();


    /**
     * Set tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException throw exception if message length greater than 140 words
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Get tweet message
     *
     * @return return tweet message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Get date of tweet
     *
     * @return return tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set date of tweet
     *
     * @param date inputted date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Combine date and message of tweet
     *
     * @return return combined String
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
