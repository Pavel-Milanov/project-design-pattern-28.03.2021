package online;

import java.util.Scanner;

import observer.Observer;
import observer.*;


public class FitnessMain {
    public static void main(String[] args) {
        //Observer
        Topic topic = new Topic();

        Observer spectator1 = new TopicSubscriber("Spectator 1");
        Observer spectator2 = new TopicSubscriber("Spectator 2");
        Observer spectator3 = new TopicSubscriber("Spectator 3");

        topic.subscribe(spectator1);
        topic.subscribe(spectator2);
        topic.subscribe(spectator3);

        //GET_UP
        AbstractFactory  exerciseFactory = FactoryProducer.getFactory("EXERCISE_FACTORY");
        doExercise getUp = exerciseFactory.getExercise("GET_UP");

        //LIE_DOWN
        doExercise lieDown = exerciseFactory.getExercise("LIE_DOWN");


        //auditory see
        AbstractFactory audienceFactory = FactoryProducer.getFactory("AUDIENCE_FACTORY");
        tellAudience tellAudience = audienceFactory.getAttention("SEE");

        //telling auditory
        tellAudience seeAuditory = audienceFactory.getAttention("TELL");
        //seeAuditory.getAttentionAudience();

        Scanner input = new Scanner(System.in);

        int n = 1;
        while (n!=0){
            System.out.println(
                    "Press 0 for Ending the Training.\n" +
                    "Press 1 for Get UP Exercise.\n" +
                    "Press 2 for Lie Down Exercise.\n" +
                    "Press 3 for 5 Min Break.");
            n = input.nextInt();
            System.out.println("");

            if (n == 1){
                getUp.exercise();
                tellAudience.getAttentionAudience();
                topic.setTopicName("Getting Up");
                seeAuditory.getAttentionAudience();
                System.out.println("\n");
            }

            if (n == 2){
                lieDown.exercise();
                tellAudience.getAttentionAudience();
                topic.setTopicName("Lying Down");
                seeAuditory.getAttentionAudience();
                System.out.println("\n");
            }

            if (n == 3){
                System.out.println(
                        "We will have a 5 Min Break.\n" +
                        "Have a rest and drink some Water.");
                topic.setTopicName("taking a Rest");
                System.out.println("\n");
            }
        }

        System.out.println(
                        "It was a very Exhausted Training.\n" +
                        "Well Done Everyone See You Soon!");
    }
}
