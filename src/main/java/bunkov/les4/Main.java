package bunkov.les4;

public class Main {
    public static void main(String[] args) {
        DBConnect<Employeer> connector = new Connector<>();
        connector.create(new Employeer(1,"Ivan"));
        connector = new ProxyConnector<>(connector);
        connector.readInfo();
    }
}
