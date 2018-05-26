package j_state;

/**
 * Created by ll on 26/05/2018.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
