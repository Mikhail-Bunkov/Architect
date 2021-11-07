package bunkov.les3.implementations;

import bunkov.les3.interfaces.Button;
import bunkov.les3.interfaces.Checkbox;
import bunkov.les3.interfaces.ElementsFactory;
import bunkov.les3.interfaces.Scroll;

public class MacOSElementsFactory implements ElementsFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Scroll createScroll() {
        return new MacOSScroll();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
