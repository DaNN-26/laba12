public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ермохин Дмитрий Евгеньевич", 22, "Чаадаевкология", "ErmohaJoker", "Ermoha22Krut");
        Teacher teacher2 = new Teacher("Дугин Илья Алексеевич", 21, "Теория бизнеса", "xlzpm", "dugin1993");
        Student student1 = new Student("Уханов Алексей Александрович", 17, "Факультет математики", "uho2006", "pobedaletsgo");
        Student student2 = new Student("Лапицкий Даниил Владимирович", 17, "Факультет русского языка", "DaNN26", "VenoMplAyers2611");

        teacher1.Login();
        teacher1.Password();
        System.out.println();
        teacher2.Login();
        teacher2.Password();
        System.out.println();
        student1.Login();
        student1.Password();
        System.out.println();
        student2.Login();
        student2.Password();
        System.out.println();
    }
}
interface User {
    void Login();
    void Password();
}
abstract class People implements User
{
    public String Name;
    public int Age;
    public String Prof;
    People(String name, int age, String prof)
    {
        this.Name = name;
        this.Age = age;
        this.Prof = prof;
    }
}
class Teacher extends People
{
    String Login;
    String Password;
    Teacher(String name, int age, String prof, String Login, String Password)
    {
        super(name, age, prof);
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login()
    {
        System.out.println(Login);
    }
    @Override
    public void Password()
    {
        System.out.println(Password);
    }
}
class Student extends People
{
    String Login;
    String Password;
    Student(String name, int age, String prof, String Login, String Password) {
        super(name, age, prof);
        this.Login = Login;
        this.Password = Password;
    }

    @Override
    public void Login()
    {
        System.out.println(Login);
    }

    @Override
    public void Password()
    {
        System.out.println(Password);
    }
}