package org.kelly_ann.tweet

class Tweet {
	String username
	String [] content
	List hashtags = []
	List mentions = []

	def postTweet(String username, String content) {

		List words = content.split(' ')

		words.each { word ->
			if(word.startsWith('#')) { hashtags << word }
			if(word.startsWith('@')) { mentions << word }
		}

		println "$username says: $content"

	}

}
