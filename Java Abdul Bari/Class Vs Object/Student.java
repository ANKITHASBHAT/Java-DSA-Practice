
public class Student
{
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private Subject sub[];
    
    
    public Student(String roll,String name)
    {
         this.rollNo=roll;
         this.name=name;
         
    }
    public Student(String roll,String name,int ns)
    {
         this.rollNo=roll;
         this.name=name;
         this.numOfSub=ns;
    }
    
    public String getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public int getNoOfSubjects(){return numOfSub;}
    public Subject[] getSubjects(){return sub;}
    
    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setSubjects(Subject ...subs)
    {
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }
    
    @Override
    public String toString()
    {
        return "Roll :" +rollNo+"\nName :"+name+"\nDept :"+dept;
    }
    
}

