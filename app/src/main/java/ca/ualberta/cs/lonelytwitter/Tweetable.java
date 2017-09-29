
/*
 * Tweetable
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
 * Mark tweet as tweetable or not
 *
 * @author mingwei
 * @version 1.5
 * @since 1.0
 */

public interface Tweetable {
    String getMessage();
    Date getDate();
}
