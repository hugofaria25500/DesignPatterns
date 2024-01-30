package Creational._7_ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {

    private List<PooledObject> pool;
    private int poolSize;

    //CONSTRUCTOR TO INITIALIZE THE OBJECT POOL WITH A PREDEFINED NUMBER OF OBJECTS
    public ObjectPool(int poolSize){
        this.poolSize = poolSize;
        initializedPool();
    }

    // METHOD TO INITIALIZE THE POOL WITH OBJECTS
    private void initializedPool() {
        pool = new ArrayList<>(poolSize);
        for(int i = 0; i < poolSize; i++) {
            pool.add(new PooledObject());
        }
    }

    //METHOD TO ACQUIRE AN OBJECT FROM THE POOL
    public PooledObject acquiredObject() {
        for(PooledObject obj : pool) {
            if(!obj.isBusy()) {
                obj.setBusy(true);
                obj.performOperation();
                return obj;
            }
        }
        return null;
    }

    //METHOD TO RELEASE AN OBJECT TO THE POOL
    public void releaseObject(PooledObject obj) {
        obj.reset();
        obj.setBusy(false);
    }
}
