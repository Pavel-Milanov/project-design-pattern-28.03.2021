package observer;

public class ObserverMain {
    public static void main(String[] args) {


        Topic topic = new Topic();

        Observer spectator1 = new TopicSubscriber("spectator 01");
        Observer spectator2 = new TopicSubscriber("spectator 02");
        Observer spectator3 = new TopicSubscriber("spectator 03");

        topic.subscribe(spectator1);
        topic.subscribe(spectator2);
        topic.subscribe(spectator3);


        topic.setTopicName("Getting UP");

        topic.setTopicName("Lying Down");




    }
}
