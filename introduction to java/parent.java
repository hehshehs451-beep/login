public class parent {
    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Name:"+name);
    }
}

class Child extedns parent
{
    void ageN(int age)
    {
        Sstem.out.println("age of student is: "+age);
    }
}
class Main 
{
    public static void main(String [] er)
    {
        Child s = new Child();
        s.naming("Aashish");
        s.ageN(14);
    }
}