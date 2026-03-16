package pr4.interfaces.model;

public class LogicGame implements IGame{
    @Override
    public void a() {
        System.out.println("LogicGame: [A] Hacking firewall...");
    }

    @Override
    public void b() {
        System.out.println("LogicGame: [B] Decrypting signal...");
    }

    @Override
    public void c() {
        System.out.println("LogicGame: [C] Bypassing system...");
    }

    @Override
    public void d() {
        System.out.println("LogicGame: [D] Launching missile...");
    }
}
