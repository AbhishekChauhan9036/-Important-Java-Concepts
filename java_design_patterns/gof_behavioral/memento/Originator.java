package java_design_patterns.gof_behavioral.memento;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void loadStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
