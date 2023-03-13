
public class Student implements Observer {

    private String name;

    public Student(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println(this.name + " has learned " + message);
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }



}
