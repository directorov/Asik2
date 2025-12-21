
public class Human {
    private int age;
    private String H_name;
    private boolean study= false;

    public Human(int age, String H_name){
        this.age= age;
        this.H_name= H_name;
    }

    public Human() {

    }

    class Student extends Human {

        public Student(int age,String H_name) {
            super(age, H_name); // Связь с родителем: отдаем ему имя и возраст
    }
    public void student(String group){
        if(study) {
            System.out.println(H_name + "studied" + group);
            study = true;
        }
        else{
            System.out.println(H_name + "not studied here");
        }
        }
    }
    //getters
    public String getH_Name() {return H_name;}
    public int getage(){ return age;}
    public boolean getstudy(){ return study;}
    //setters
    public void setH_name(String H_name) {this.H_name = H_name;}
    public void setage(int age ){this.age = age;}
    public void setstudy(boolean study){this.study = study;}
}
