package observer;

public class TopicSubscriber implements Observer{

    private String name;
    private Observable topic;

    public TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (this.topic == null){
            System.out.println(this.name + "has no topic set");
            return;
        }
        String topicName = this.topic.getUpdate();
        System.out.println(this.name + " is doing the Exercise : " + topicName);
    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }

}
