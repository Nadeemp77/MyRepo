package myPackage;

class Student {
    private Student()
    {


    }
    public void print()
    {
        System.out.println("Hello");
    }
    public static Student getObj()
    {
        return new Student();
    }
    }
