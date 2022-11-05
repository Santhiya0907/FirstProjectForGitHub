package com.connect.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService stuser;

	@PostMapping(value = "/saveone")
	public String saveOne(@RequestBody StudentEntity stud) {
		return stuser.saveOne(stud);
	}

	@PostMapping(value = "/saveall")
	public String allSave(@RequestBody List<StudentEntity> stud) {
		return stuser.allSave(stud);
	}

	@GetMapping(value = "/find/{id}")
	public StudentEntity search(@PathVariable int id) {
		return stuser.search(id);
	}

	@GetMapping(value = "/findall")
	public List<StudentEntity> searchAll() {
		return stuser.searchAll();
	}

	@DeleteMapping(value = "/del/{id}")
	public String del(@PathVariable int id) {
		return stuser.del(id);
	}

	@DeleteMapping(value = "/delall")
	public String delall() {
		return stuser.delall();
	}

	@GetMapping(value = "/con")
	public List<StudentEntity> con() {
		return stuser.con();
	}

	@PostMapping(value = "/limit")
	public String ageLimit(@RequestBody StudentEntity al) {
		return stuser.ageLimit(al);
	}

	@PostMapping(value = "/ageLimit")
	public List<StudentEntity> printage(@RequestBody List<StudentEntity> ag) {
		return stuser.printage(ag);
	}


}
