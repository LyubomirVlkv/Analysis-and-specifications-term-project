package project.fmi.models;
import java.util.*;

/**
 * 
 */
public class Subject {

   
    private String subjectName;
    private int mark;
    private String subjectExam;
    private List<Lecturer> lecturers;
  
    
    
    /**
     * Default constructor
     */
    public Subject(final String subjectName,final int mark,List<Lecturer> lecturer) {
    	this.subjectName=subjectName;
    	this.mark = mark;
    	lecturers=lecturer;
    }
    
    public Subject() {}

    /**
     * 
     */
    /**
     * @param subjectName 
     * @return
     */
    public void setSubjectName(String subjectName) {
        // TODO implement here
        this.subjectName = subjectName;
    }

    /**
     * @return
     */
    public List<Lecturer> getSubjectLecturer() {
        // TODO implement here
        if(null==lecturers) {
        	lecturers = new ArrayList<Lecturer>();
        }
        return lecturers;
    }

    /**
     * @param lecturer 
     * @return
     */
    public void setSubjectLecturer(List<Lecturer> lecturer) {
        // TODO implement here
        if(null!=lecturers) {
        	lecturers=lecturer;
        }
    }

    /**
     * @return
     */
    public String getSubjectExamName() {
        // TODO implement here
        return subjectExam;
    }

    /**
     * @param subjectExam 
     * @return
     */
    public void setSubjectExamName(String subjectExam) {
        // TODO implement here
        this.subjectExam = subjectExam;
    }

    /**
     * @return
     */
    public int getMark() {
        // TODO implement here
        return mark;
    }

    /**
     * @param mark 
     * @return
     */
    public void setMark(int mark) {
        // TODO implement here
        this.mark=mark;
    }

    /**
     * @return
     */
    public String getSubjectName() {
        // TODO implement here
        return subjectName;
    }

}