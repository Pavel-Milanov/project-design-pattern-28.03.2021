package online;

public class AudienceSeeDisplay implements tellAudience{


    @Override
    public tellAudience getAttentionAudience() {
        System.out.println("Audience see the display and prepare for exercise.");
        return null;
    }
}
