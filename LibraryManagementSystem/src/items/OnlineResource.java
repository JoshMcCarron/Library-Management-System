package items;

public abstract class OnlineResource {
	private String title;
	
	public OnlineResource(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
