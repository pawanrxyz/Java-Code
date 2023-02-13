 class Student 
{
    private String name;
    private int rollNumber;
    int salary;

    public int getSalary() 
    {
        return this.salary;
    }
    public void setSalary(int salary)
    {
        if(salary<=0) 
        {
            throw new IllegalArgumentException("Invalid salary");
        }
        this.salary = salary;
    }
    public int getName() 
    {
        return this.getName();
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getRollNumber() 
    {
        return this.rollNumber;
    }
    
    public void setRollNumber(int rollNumber)
    {
        if(rollNumber<=0)
        {
            throw new IllegalArgumentException("Invalid Args");
        }
        this.rollNumber = rollNumber;
    }
    void display()
    {
        System.out.println("Your name is: "+this.name);
        System.out.println("Your rollNumber is: "+this.rollNumber);
        System.out.println("Your salary is: "+this.salary);
    }

    public void rollNumber(int i) {
    }
}
public class Java_2 {
    public static void main(String[] args) {

    Student str1 = new Student();
    str1.setName("Soniya");
    str1.setRollNumber(23);
    str1.setSalary(1245);
    str1.display();    
   }       
}
