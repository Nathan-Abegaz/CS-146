
public class Website {
	
	private int index;
	private int frequency,year,connections, subscription,totalScore;
	private int pageRank;
	private String url;
	
	public Website(int index, int frequency, int age, int connections,int subscription, int totalScore, int pageRank, String url)
	{
		this.index = index;
		this.frequency = frequency;
		this.year = age;
		this.connections = connections;
		this.subscription = subscription;
		this.totalScore = totalScore;
		this.pageRank = pageRank;
		this.url = url;
	}
	
		public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getPageRank() {
		return pageRank;
	}

	public void setPageRank(int pageRank) {
		this.pageRank = pageRank;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

 

}