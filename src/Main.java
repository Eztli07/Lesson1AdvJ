public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Goodbye Universe");

        Student shawn = new Student("Shawn", "A", 19, 4.0, false);
        Student jasmine = new Student("Jasmine", "A", 16, 4.5, true);
        System.out.println(shawn);
        System.out.println(jasmine);
        System.out.println("\t Class currently contains: ");

        Student[] advJava = new Student[2];
        advJava[0] = shawn;
        advJava[1] = jasmine;

        for(Student s: advJava)
        {
            System.out.println(s);
        }

    }
}