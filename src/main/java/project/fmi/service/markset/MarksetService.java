package project.fmi.service.markset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import project.fmi.models.Lecturer;
import project.fmi.models.Subject;

public class MarksetService {
	
	 private List<Subject> subjectDB = new ArrayList<>(); 
	 private static List<Lecturer> physicsLecturers = new ArrayList<>();
	 private static List<Lecturer> mathsLecturers = new ArrayList<>();
	 
	 
	public static String setmark(String subjectName, int mark, String username) {
		Lecturer lecturer = new Lecturer("i.ivanov","ivanovpass123","Ivan Ivanov");
		Lecturer lecturer2 = new Lecturer("g.georgiev","georgievass123","Georgi Georgiev");
		Lecturer lecturer3 = new Lecturer("v.simeonov","passunisimeonov2","Valentin Simeonov");
		physicsLecturers.add(lecturer);
		physicsLecturers.add(lecturer2);
		mathsLecturers.add(lecturer3);
		Subject physics = new Subject("Physics", 2, physicsLecturers);
		Subject maths = new Subject("Mathematics", 2, mathsLecturers);
	
		
		if(subjectName == physics.getSubjectName()) {
			for(int i=0; i<physicsLecturers.size(); i++) {
				if(username==physicsLecturers.get(i).getUsername()) {
					if(mark < 2) {
						return "Oценката не може да е по-малко от 2!";
					}
					else if (mark>6) {
						return "Оценката не може да е по-голяма от 6!";
					}
					else if (mark >=2 && mark <=6) {
						return "Записването е успешно";
					}
				}
			}
			return "Преподавателят не може да въвежда оценки по този предмет!";
		}
		else if (subjectName == maths.getSubjectName()) {
			for(int i=0; i<mathsLecturers.size(); i++) {
				if(username==mathsLecturers.get(i).getUsername()) {
					if(mark < 2) {
						return "Oценката не може да е по-малко от 2!";
					}
					else if (mark>6) {
						return "Оценката не може да е по-голяма от 6!";
					}
					else if (mark >=2 && mark <=6) {
						return "Записването е успешно";
					}
				}
			}
			return "Преподавателят не може да въвежда оценки по този предмет!";
		}	
		else if((subjectName != maths.getSubjectName()) || (subjectName != physics.getSubjectName()))
		return "Not a valid subject!";
		
		return "";
	}

}
