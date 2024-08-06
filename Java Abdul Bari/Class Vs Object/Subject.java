


public class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    @Override
    public String toString()
    {
        return "\nSubject ID:"+subID+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
    }
}
