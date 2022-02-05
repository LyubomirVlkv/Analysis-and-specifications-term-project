package project.fmi.models;
import java.util.*;

/**
 * 
 */
public class Lecturer {

   

    private String username;
    private String password;
    private String fullName;
    private List<Subject> subjects;
    private schoolClass schoolclass;

    
    /**
     * Default constructor
     */
    public Lecturer(final String username, final String password, final String fullName) {
    	this.username=username;
    	this.password=password;
    	this.fullName=fullName;
    }
    
    public Lecturer() {};
    
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
       this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        
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
    public schoolClass getSchoolClass() {
        
        return schoolclass;
    }

    /**
     * @param password 
     * @return
     */
    public void setSchoolClass(schoolClass schoolclass) {
        // TODO implement here
        this.schoolclass=schoolclass;
    }

    /**
     * @return
     */
    public String getFullName() {
        // TODO implement here
        return fullName;
    }

    /**
     * @param fullName 
     * @return
     */
    public void setFullName(String fullName) {
        // TODO implement here
        this.fullName=fullName;
    }
    
    public  List<Subject> getSubject() {
		if (null == subjects) {
			subjects = new ArrayList<Subject>();
		}
		return subjects;
	}

	/**
	 * @param users
	 * @return
	 */
	public void setSubject( List<Subject> subjects) {
		if (null != subjects) {
			this.subjects = subjects;
		}
	}



  


  

}