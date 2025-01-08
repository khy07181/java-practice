package behavioral_patterns.observer.news;

import org.junit.jupiter.api.Test;

class NewsTest {

    @Test
    void observer() {
        NewsAgency agency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        agency.registerObserver(channel1);
        agency.registerObserver(channel2);

        agency.publishNews("Breaking news: Observer pattern in action!");

        agency.removeObserver(channel2);

        agency.publishNews("Another update: Channel 2 unsubscribed.");
    }

}
