package creational_patterns.singleton;

public final class LivingRoom {
    private static LivingRoom INSTANCE;

    public synchronized static LivingRoom getInstance() {
        if(INSTANCE != null) {
            INSTANCE = new LivingRoom();
        }
        return INSTANCE;
    }

    private LivingRoom(){ }
}
