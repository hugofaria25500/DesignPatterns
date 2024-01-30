package Creational._7_ObjectPool;

public class Main {
//## CREATIONAL - OBJECT POOL ## //

    public static void main(String[] args) {
    //CLIENT CODE USING THE OBJECT POOL

        ObjectPool objectPool = new ObjectPool(5);

        //ACQUIRE OBJECT FROM THE POOL
        PooledObject obj1 = objectPool.acquiredObject();
        PooledObject obj2 = objectPool.acquiredObject();

        //USE ACQUIRED OBJECTS
        if(obj1 != null && obj2 != null) {
            System.out.println("Counter for obj1: " +  obj1.getCounter());
            System.out.println("Counter for obj2: " +  obj2.getCounter());

            objectPool.releaseObject(obj1);
            objectPool.releaseObject(obj2);
        }
    }
}
