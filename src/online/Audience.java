package online;

public class Audience implements tellAudience{


    @Override
    public tellAudience getAttentionAudience() {
        System.out.println("Audience had done the Exercise.");
        return null;
    }
}
