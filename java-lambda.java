public interface StateChangeListener {

    public void onStateChange(State oldState, State newState);

}


//This Java interface defines a single method which is called whenever the state changes (in whatever is being observed).
//In Java 7 you would have to implement this interface in order to listen for state changes. Imagine you have a class called StateOwner which can register state event listeners. Here is an example:
public class StateOwner {

    public void addStateListener(StateChangeListener listener) { ... }

}

//In Java 7 you could add an event listener using an anonymous interface implementation, like this:

StateOwner stateOwner = new StateOwner();

stateOwner.addStateListener(new StateChangeListener() {

    public void onStateChange(State oldState, State newState) {

        // do something with the old and new state.

    }

});



//First a StateOwner instance is created. Then an anonymous implementation of the StateChangeListener interface is added as listener on the StateOwner instance.
//In Java 8 you can add an event listener using a Java lambda expression, like this:

StateOwner stateOwner = new StateOwner();

stateOwner.addStateListener(

    (oldState, newState) -> System.out.println("State changed")

);



//The lambda expressions is this part:
(oldState, newState) -> System.out.println("State changed")



