/*
 * Write a singleton class
 */

package tier2;
 

// Singleton -> you can create only 1 object of the class
public class SingletonX {
    
    private static SingletonX singlton;
    
    //initializing in a static block executed when the class is loaded
    static {
        singlton = new SingletonX();
    }
    
    // making constructor private to prevent extra initializing
    private SingletonX () {
    }
    
    public static SingletonX getSingletonX(){
        return singlton;
    }
    
    public void test () {
        System.out.println("Creating the singleton success.");
    }
    
    public static void main (String args[]) {
        SingletonX ms = SingletonX.getSingletonX();
        ms.test();
    }
    
}
