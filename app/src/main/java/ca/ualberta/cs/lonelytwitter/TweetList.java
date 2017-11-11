package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

class TweetList { // removed public since it can be package-private
    private final ArrayList<Tweet> tweets = new ArrayList<Tweet>(); // add final since declaration can have final modifier

    public TweetList(){

    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet){return tweets.contains(tweet);}

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
