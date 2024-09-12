package Observer_Pattern;

// Concrete Subject

public class NewsAgency extends Subject {
    private String latestNews;

    public void setNews(String news) {
        this.latestNews = news;
        notifyObservers(news);
    }
}
