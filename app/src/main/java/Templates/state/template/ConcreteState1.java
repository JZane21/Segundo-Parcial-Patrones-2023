package Templates.state.template;

public class ConcreteState1 implements IState {
    @Override
    public void handler() {
        System.out.println("Logica del Concrete State 1");
        // logica
    }
}