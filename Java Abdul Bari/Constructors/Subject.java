public class Subject {
    private  String subID;
    private String subName;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subID, String subName, int maxMarks){
        this.subID = subID;
        this.subName = subName; 
        this.maxMarks = maxMarks;
    }

    public String getSubID(){return subID;}
    public String getSubName(){return subName;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtained(){return marksObtained;}

    public void setMaxMarks(int maxMarks){this.maxMarks = maxMarks;}

    public void setMarkObtained(int marksObtained){this.marksObtained = marksObtained;}

    boolean isQualified(int m){
        return m >= 30 && m <= maxMarks;
    }
    @Override
    public String toString(){
        return "\nSubjectID: " + subID + "\nName: " + subName + "\n maxMarks: " + maxMarks + "\nMarks Obtained: " + marksObtained;
    }

}