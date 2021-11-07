package bunkov.les3.implementations;

import bunkov.les3.interfaces.Button;
import bunkov.les3.interfaces.Checkbox;
import bunkov.les3.interfaces.ElementsFactory;
import bunkov.les3.interfaces.Scroll;

public class WindowsElementsFactory implements ElementsFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
