package org.kelly_ann.main

import org.kelly_ann.tweet.Tweet

static main(args) {

	def myTweet = new Tweet()

	myTweet.postTweet("kelly-ann", "I am #awesome and @mick you're the #best!")
	
	println "hashtags: $myTweet.hashtags"
	println "mentions: $myTweet.mentions"

}
