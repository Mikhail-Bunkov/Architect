package bunkov.les3.implementations;

import bunkov.les3.interfaces.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("LinuxButton");
    }
}
