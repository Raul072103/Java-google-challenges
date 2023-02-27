public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs){
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("The animal walks strangely and has " + legs);
    }


}
