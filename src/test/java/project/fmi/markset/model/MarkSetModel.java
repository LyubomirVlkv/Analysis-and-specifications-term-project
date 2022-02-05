package project.fmi.markset.model;

import project.fmi.service.markset.MarksetService;

public class MarkSetModel {

	private String subjectName;
	private int mark;
	private String message;
	private String username;

	public void setSubjectName(final String subjectName) {
		this.subjectName = subjectName;
		
	}

	public void setSubjectMark(int mark) {
		this.mark=mark;
		
	}
	
	public void setUsername(String username) {
		this.username=username;
		
	}


	public void clickSaveButton() {
		message = MarksetService.setmark(subjectName, mark, username);
		
	}

	public String getMessage() {
		return message;
	}

	
}
