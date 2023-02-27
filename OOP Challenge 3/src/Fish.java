public class Fish extends Animal implements  Pet{

    private String name;

    public Fish(){
        super(0);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void play(){
        System.out.println("The fish doesnt play with humans");
    }

    public void walk(){
        System.out.println("The fish doesnt have legs so it cant walk");
    }

    public void eat(){
        System.out.println("The fish likes to eat food from the pet store!");
    }

}
