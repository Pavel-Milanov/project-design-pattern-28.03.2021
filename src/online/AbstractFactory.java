package online;

public abstract class AbstractFactory {

    abstract doExercise getExercise(String exercise);
    abstract tellAudience getAttention(String attention);
}
