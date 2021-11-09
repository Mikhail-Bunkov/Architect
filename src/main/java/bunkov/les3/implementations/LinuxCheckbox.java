package bunkov.les3.implementations;

import bunkov.les3.interfaces.Checkbox;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("LinuxCheckbox");
    }
}
