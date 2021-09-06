package main;

import main.model.Influencer;
import main.model.Follower;

public class InstagramPosts {
	
	public static void main(String[] arge)
	{
		Influencer influencer1 = new Influencer("Liza Koshy");
		
		Follower follower1 = new Follower("Isabel Flores");
		Follower follower2 = new Follower("Jenny Gonzalez");
		Follower follower3 = new Follower("Bridget Rascon");
		
		influencer1.addSubscriber(follower1);
		influencer1.addSubscriber(follower2);
		influencer1.addSubscriber(follower3);
		
		influencer1.notifySubscribers(" Baby Koshy coming this Winter....!");
	}


}
