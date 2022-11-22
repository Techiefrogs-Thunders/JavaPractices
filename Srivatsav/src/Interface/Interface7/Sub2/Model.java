package Interface.Interface7.Sub2;

import Interface.Interface7.Sub.IModel;

public class Model {
    public Model() {
    }

    protected class Mode implements IModel {

        public Mode() {

        }

        @Override
        public void work() {
            System.out.println("System is in Work mode!!!");
        }

        @Override
        public void rest() {
            System.out.println("System is in Rest mode!!!");
        }
    }

}
