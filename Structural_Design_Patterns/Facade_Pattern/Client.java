package Facade_Pattern;

// Client Code

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem);

        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}