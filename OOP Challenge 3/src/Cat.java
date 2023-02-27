public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name){
        super(4);

        System.out.println("All cats have " + legs + " legs");

        this.name = name;

    }

    public Cat(){
        this("");
    }

    @Override
    public void eat(){
        System.out.println("The cat has a strange way of eating");
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
   public void setName(String name){
        this.name = name;
    }

    @Override
    public void play(){
        System.out.println("The cat likes to play with red dots made by lasers!");
    }


}
