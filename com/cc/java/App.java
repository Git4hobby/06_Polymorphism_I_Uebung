package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

        // Bildung eines Objekts aus der Superklasse
        //-- Das sollte eigentlich nicht gehen!--//
        HoneyBee bee = new HoneyBee(); // SuperKlasse!
        pollObj(bee);

        // output(queen.doYourJob());
        // output(queen.fly());
        // output("--------------------");

        // output(worker.doYourJob());
        // output(worker.fly());
        // output("--------------------");

        // output(drone.doYourJob());
        // output(drone.fly());
        // output("--------------------");

    }

    // 2. Iteration: Polymorphie
    private static void pollObj(HoneyBee obj){
    output(obj.doYourJob());
    output(obj.fly());
    output("--------------------");
   }

// Overloading --- gleiche MethodenName aber unterschiedliche Parameterstruktur

//    private static void pollObj(Worker obj){
//     output(obj.doYourJob());
//     output(obj.fly());
//     output("--------------------");
//    }
//     private static void pollObj(Drone obj){
//         output(obj.doYourJob());
//         output(obj.fly());
//         output("--------------------");
//     }
   
   
   
   private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

