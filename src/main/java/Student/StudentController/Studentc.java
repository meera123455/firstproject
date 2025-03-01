package Student.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Student.StudentModel.Studentm;
import Student.StudentService.Students;

@RestController
public class Studentc {
	@Autowired
	Students future;

	@PostMapping("/post")
	public Studentm create(@RequestBody Studentm c) {
		future.create(c);
		return c;
	}

	@PutMapping("/put")
	public Studentm update(@RequestBody Studentm d) {
		future.create(d);
		return d;
	}

	@GetMapping("/one/{id}")
	public Studentm getone(@PathVariable("id") int id) {
		return future.getone(id);
	}

	@GetMapping("/getAll")
	public List<Studentm> getAll() {
		return future.getAll();
	}

	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable("id") int id) {
		future.delete(id);
	}
}
