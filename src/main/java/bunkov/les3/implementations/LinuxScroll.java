package bunkov.les3.implementations;

import bunkov.les3.interfaces.Scroll;

public class LinuxScroll implements Scroll {
    @Override
    public void onScroll() {
        System.out.println("LinuxScroll");
    }
}
