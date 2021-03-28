package online;

public class ExerciseFactory extends AbstractFactory{


    @Override
    doExercise getExercise(String exercise) {

        if (exercise == "GET_UP"){
            return new GetUp();
        }
        if (exercise == "LIE_DOWN"){
            return new LieDown();
        }

        System.out.println("The Exercise is not in the program!");
        return null;
    }

    @Override
    tellAudience getAttention(String attention) {
        return null;
    }
}
