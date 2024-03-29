package Inheritance;

/**
 * @Author pankaj
 * @create 4/24/21 5:47 PM
 */
public class Dog extends Animal{
    private int  eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name,1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    //=============================================
    public void chew(){
        System.out.println("Dog ---> chewing()");
    }
    public void move(int speed)
    {
        System.out.println("Dog.move()");
        moveLege(speed);
    }
    public void moveLege(int speed){
        System.out.println("Dog --> move() called");
    }
    public void walk() {
        System.out.println("Dog.walk()");
        super.move(5);
    }
    public void run() {
        System.out.println("Dog.run()");
        super.move(10);
    }
    @Override
    public void eat() {
        System.out.println("Dog class --> eat() called");
        chew();
        super.eat();
    }
}
