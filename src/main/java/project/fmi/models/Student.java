package project.fmi.models;
import java.util.*;

/**
 * 
 */
public class Student {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    private String username;
    private String password;
    public String studentName;
    private schoolClass schoolclass;
    private Set<Parent> parents;
    public List<Subject> subject;

    /**
     * @return
     */
    public String getUsername() {
        // TODO implement here
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        // TODO implement here
        this.username=username;
    }
    
    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    /**
     * @param username 
     * @return
     */
    public void setPassword(String password) {
        // TODO implement here
        this.password=password;
    }
    
    
    

    /**
     * @return
     */
    public List<Subject> getSubject() {
        // TODO implement here
        return schoolclass.getSubject();
    }

    /**
     * @return
     */
   
    public String getName() {
        // TODO implement here
        return studentName;
    }

    /**
     * @param studentName 
     * @return
     */
    public void setName(String studentName) {
        // TODO implement here
        this.studentName = studentName;
    }
    
    public schoolClass getschoolClass() {
    	if(schoolclass==null) {
    		schoolclass = new schoolClass();
    	}
    	return schoolclass;
    }
    
    public void setschoolClass(schoolClass schoolclass) {
    	this.schoolclass=schoolclass;
    }
    
    public Set<Parent> getgetParents() {
    	if(parents==null) {
    		parents = new HashSet<Parent>();
    	}
    	return parents;
    }
    
    public void setschoolClass(Set<Parent> parents) {
    	if(null!=parents) {
    		this.parents=parents;
    	}
    }


}