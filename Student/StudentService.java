package com.connect.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
	private static final int x = 0;
	@Autowired
	StudentDao studao;

	public String saveOne(StudentEntity stud) {
		return studao.saveOne(stud);
	}

	public String allSave(List<StudentEntity> stud) {
		return studao.allSave(stud);
	}

	public StudentEntity search(int id) {
		return studao.search(id);
	}

	public List<StudentEntity> searchAll() {
		return studao.searchAll();
	}

	public String del(int id) {
		return studao.del(id);
	}

	public String delall() {
		return studao.delall();
	}

	public List<StudentEntity> con() {
		return studao.con().stream().filter(x -> x.getGender().equals("Female")).toList();

	}

	public String ageLimit(StudentEntity al) {
		if (al.getAge() > 18) {
			return " NOT ALLOWED";
		}
		return studao.ageLimit(al);
	}

	public List<StudentEntity> printage(List<StudentEntity> ag) {
		return studao.printage(ag);

	}


}