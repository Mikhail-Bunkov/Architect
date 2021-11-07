package bunkov.les3;

import bunkov.les3.interfaces.ElementsFactory;

public class UIService {
    private ElementsFactory factory;

    public UIService(ElementsFactory factory) {
        this.factory = factory;
    }

    public ElementsFactory getFactory() {
        return factory;
    }

    public void setFactory(ElementsFactory factory) {
        this.factory = factory;
    }
    public void creating(){
        factory.createButton();
        factory.createCheckbox();
        factory.createScroll();
    }
    public void activating(){
        factory.createButton().click();
        factory.createCheckbox().check();
        factory.createScroll().onScroll();
    }
}
