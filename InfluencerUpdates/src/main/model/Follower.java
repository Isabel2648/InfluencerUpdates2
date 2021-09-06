package main.model;

import main.interfaces.Observer;
import main.interfaces.Subject;


public class Follower implements Observer {

	private String followerName;
	
	public Follower(String followerName)
	{
		this.followerName = followerName;
	}
	
	public String getFollowerName() {
		return followerName;
	}
	
	public void setFollowerName(String followerName)  {
		this.followerName = followerName;
		}
	
	public void notifySubscribers(String message, String name) {
	System.out.println("Hey "+ this.followerName +", -> "+ name +", has posted a new pic on instaram with this caption: "+ message);	
	}
	
}

