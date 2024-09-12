package Facade_Pattern;

// Facade

public class HomeTheaterFacade {
    private SoundSystem soundSystem;
    private TV tv;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem) {
        this.tv = tv;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        tv.turnOn();
        soundSystem.turnOn();
        System.out.println("Movie time!");
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        soundSystem.turnOff();
        tv.turnOff();
        System.out.println("Movie ended.");
    }
}