package com.connect.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository stuRepo;

	public String saveOne(StudentEntity stud) {
		stuRepo.save(stud);
		return " SUCCESSFULLY SAVED ONE RECORD ";
	}

	public String allSave(List<StudentEntity> stud) {
		stuRepo.saveAll(stud);
		return " SUCCESSFULLY SAVED ALL RECORD ";
	}

	public StudentEntity search(int id) {
		return stuRepo.findById(id).get();
	}

	public List<StudentEntity> searchAll() {
		return stuRepo.findAll();
	}

	public String del(int id) {
		stuRepo.deleteById(id);
		return " DELETE ONE RECORD";
	}

	public String delall() {
		stuRepo.deleteAll();
		return " DELETED ALL RECORD ";
	}

	public List<StudentEntity> con() {
		return stuRepo.findAll();

	}

	public String ageLimit(StudentEntity al) {
		stuRepo.save(al);
		return "Saved Successfully";
	}

	public List<StudentEntity> printage(List<StudentEntity> ag) {
		List<StudentEntity> agl = ag.stream().filter(x -> x.getAge() < 18).toList();
		return stuRepo.saveAll(agl);

	}
	


}
