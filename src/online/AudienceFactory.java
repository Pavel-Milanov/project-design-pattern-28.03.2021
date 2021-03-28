package online;

public class AudienceFactory extends AbstractFactory{
    @Override
    doExercise getExercise(String exercise) {
        return null;
    }

    @Override
    tellAudience getAttention(String attention) {
        if (attention == "SEE"){
            return new AudienceSeeDisplay();
        }
        if (attention == "TELL"){
            return new Audience();
        }

        System.out.println("Error!");
        return null;
    }

}
