package main.model;

import java.util.ArrayList;
import java.util.List;

import main.interfaces.Observer;
import main.interfaces.Subject;

public class Influencer implements Subject {
	
	private String influencerName;
	private List<Observer> observers= new ArrayList<>();
	
	public Influencer(String influencerName) 
	{
		this.influencerName = influencerName;
	}
	
	public void addSubscriber(Observer observer)  {
		observers.add(observer);
	}
	
	public void removeSubscriber(Observer observer)  {
		observers.remove(observer);
	}
	
	
	public void notifySubscribers(String message)  {
		observers.forEach(observer -> observer.notifySubscribers(message, this.influencerName));
	}

}


