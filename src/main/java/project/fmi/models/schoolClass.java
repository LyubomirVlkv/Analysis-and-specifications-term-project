package project.fmi.models;
import java.util.*;

/**
 * 
 */
public class schoolClass {

    /**
     * Default constructor
     */
    public schoolClass() {
    }
    private String classtitle;
    private Set<Student> students;
    private List<Subject> subject;
    private Lecturer lecturer;

    /**
     * @param classtitle 
     * @return
     */
    public void setTitle(String classtitle) {
        // TODO implement here
       this.classtitle=classtitle;
    }

    /**
     * @return
     */
    public String getTitle() {
        // TODO implement here
        return classtitle;
    }

    /**
     * @return
     */
    public Lecturer getClassLecturer() {
        // TODO implement here
       if(lecturer==null) {
    	   lecturer = new Lecturer();
       }
       return lecturer;
    }

    /**
     * @param classlecturer 
     * @return
     */
    public void setClassLecturer(Lecturer classlecturer) {
        // TODO implement here
       if(classlecturer!=null) {
    	   this.lecturer = classlecturer;
       }
    }

   
    /**
     * @return
     */
    public List<Subject> getSubject() {
        // TODO implement here
    	if (null == subject) {
			subject = new ArrayList<Subject>();
		}
		return subject;
    }

    /**
     * @param subject 
     * @return
     */
    public void setSubject(List<Subject> subject) {
        // TODO implement here
    	if (null != subject) {
			this.subject = subject;
		}
    }

    /**
     * @return
     */
    public Set<Student> getStudent() {
        // TODO implement here
    	if (null == students) {
    		students = new HashSet<Student>();
		}
		return students;
	}
    

    /**
     * @param student 
     * @return
     */
    public void setStudent(Set<Student> student) {
        // TODO implement here
        if(null!=student) {
        	students=student;
        }
    }


    /**
     * @param lecturerFullName
     */
    public String getLecturerFullName(Lecturer lecturerFullName) {
        // TODO implement here
    	return lecturer.getFullName();
    }

}