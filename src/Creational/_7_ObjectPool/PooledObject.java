package Creational._7_ObjectPool;

public class PooledObject {

    private boolean isBusy;
    private int counter;

    //METHOD TO RESET THE OBJECTS STATE BEFORE RETURNING IT TO THE POOL
    public void reset() {
        isBusy = false;
        counter = 0;
    }

    //METHOD TO PERFORM SOME OPERATION WHEN THE OBJECT IS ACQUIRED
    public void performOperation(){
        counter++;
    }

    //COUNTER GETTER
    public int getCounter() {
        return counter;
    }

    //ISBUSY GETTER
    public boolean isBusy(){
        return isBusy;
    }

    //ISBUSY SETTER
    public void setBusy(boolean busy) {
        this.isBusy = busy;
    }
}
