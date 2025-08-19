public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String grade;

    public Student(String id,String name,int age,String course,String grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return this.id +" "+this.name+" "+ this.age+" "+ this.course+" "+this.grade;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    public String getCourse(){
        return this.course;
    }

    public String getGrade(){
        return this.grade;
    }
}
