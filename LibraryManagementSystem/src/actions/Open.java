package actions;

import items.Newsletter;
import items.OnlineBook;
import items.OnlineResource;
import userTypes.User;

public class Open {
	private OnlineResource resource;
	private User user;
	private boolean subscribed = false;

	public Open(OnlineResource resource, User user) {
		this.resource = resource;
		this.user = user;
	}

	public OnlineResource getOnlineResource() {
		return this.resource;
	}
	public User getUser() {
		return this.user;
	}
	
	
	
	

	public void openResource(Newsletter resource, User user) {
		if(subscribed) {
			System.out.println(user.getEmail() + " has opened a Newsletter: "+ resource.getTitle());	
		}
		else {
			System.out.println("You have not subscribed to "+ resource.getTitle());
			subscribe(resource, user);
		}
	}

	public void openResource(OnlineBook resource, User user) {
		System.out.println(user.getEmail() + " has opened an online book: "+ resource.getTitle());
	}

	public boolean subscribe(Newsletter resource, User user) {
		subscribed = true;
		return subscribed;
	}
	public boolean unSubscribe(Newsletter resource, User user) {
		subscribed = false;
		return subscribed;
	}
	
}
