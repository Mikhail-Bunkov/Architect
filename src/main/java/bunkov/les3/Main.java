package bunkov.les3;

import bunkov.les3.implementations.LinuxElementsFactory;
import bunkov.les3.implementations.MacOSElementsFactory;
import bunkov.les3.implementations.WindowsElementsFactory;
import bunkov.les3.interfaces.ElementsFactory;

public class Main {
    public static void main(String[] args) {
        ElementsFactory factory1 = new MacOSElementsFactory();
        UIService service1 = new UIService(factory1);
        service1.creating();
        service1.activating();
        ElementsFactory factory2 = new WindowsElementsFactory();
        UIService service2 = new UIService(factory2);
        service2.creating();
        service2.activating();
        ElementsFactory factory3 = new LinuxElementsFactory();
        UIService service3 = new UIService(factory3);
        service3.creating();
        service3.activating();
    }
}
