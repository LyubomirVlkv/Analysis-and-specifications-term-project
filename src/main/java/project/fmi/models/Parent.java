package project.fmi.models;
import java.util.*;

/**
 * 
 */
public class Parent {

    /**
     * Default constructor
     */
    public Parent() {
    }

    private String username;
    private String password;
    public String parentName;
    private schoolClass schoolclass;
    private Set<Student> students;
    public List<Subject> subjects;

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
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        // TODO implement here
        this.password=password;
    }

    /**
     * @return
     */
    public List<Subject> getMark() {
       
    	subjects = schoolclass.getSubject();
    	return subjects;
	}

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return parentName;
    }

    /**
     * @param parentName 
     * @return
     */
    public void getName(String parentName) {
        // TODO implement here
        this.parentName=parentName;
    }
    
    public Set<Student> getStudent() {
        
    	if (null == students) {
    		students = new HashSet<Student>();
		}
		return students;
	}
    
 public void setStudent(Set<Student> students) {
        
    	if (null != students) {
    		this.students = students;
		}
		
	}


}