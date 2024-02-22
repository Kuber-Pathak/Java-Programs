/*The final keyword is used to denote that a particular element such as variable,
 method and class cannot be further modified, overridden or extended onces it has 
 been declared as final.*/
class Bike {
    final int speedlimit = 40; // final variable

    final void display() {
        System.out.println("Bike's speedlimit is: " + speedlimit);
    }
}

class Cycle extends Bike {
    /*
     * speedlimit = 60; //error, cannot change value of final variable
     * 
     * void display(){ //error, cannot override final method
     * System.out.println("Cycle's speedlimit is: "+speedlimit);
     * }
     */
}

class Final_KeywordExample {
    public static void main(String[] args) {
        Cycle c = new Cycle();
        c.display();
    }
}