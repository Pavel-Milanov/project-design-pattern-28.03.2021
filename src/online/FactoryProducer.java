package online;

public class FactoryProducer {

    public static AbstractFactory getFactory(String name){

        if (name == "EXERCISE_FACTORY"){
            return new ExerciseFactory();
        }

        if (name == "AUDIENCE_FACTORY"){
            return new AudienceFactory();
        }

        System.out.println("UNKNOWN FACTORY!%nCHECK AGAIN!");
        return null;
    }

}
