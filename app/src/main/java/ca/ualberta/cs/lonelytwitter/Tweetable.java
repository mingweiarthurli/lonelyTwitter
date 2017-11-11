package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

interface Tweetable { // removed public since it can be package-private
    String getMessage(); // removed public since modifier "public" is redundant for interface methods

    Date getDate(); // removed public since modifier "public" is redundant for interface methods

}
