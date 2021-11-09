package bunkov.les3.implementations;

import bunkov.les3.interfaces.Button;

public class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOSButton");
    }
}
