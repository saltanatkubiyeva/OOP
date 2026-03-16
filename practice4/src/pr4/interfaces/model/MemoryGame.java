package pr4.interfaces.model;

public class MemoryGame implements IGame{

    @Override
    public void a() {
        System.out.println("MemoryGame: [A] Scanning galaxy...");
    }

    @Override
    public void b() {
        System.out.println("MemoryGame: [B] Warping through...");
    }

    @Override
    public void c() {
        System.out.println("MemoryGame: [C] Detecting signals...");
    }

    @Override
    public void d() {
        System.out.println("MemoryGame: [C] Recalling coordinates...");
    }
}
