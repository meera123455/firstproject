package Student.StudentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Student.StudentModel.Studentm;
import Student.StudentRepository.Studentr;

@Service
public class Students {
	@Autowired
	Studentr carrier;

	public Studentm create(Studentm a) {
		return carrier.save(a);
	}

	public Studentm update(Studentm b) {
		return carrier.save(b);
	}

	public void delete(int id) {
		carrier.deleteById(id);
	}

	public Studentm getone(int id) {

		return carrier.findById(id).get();
	}

	public List<Studentm> getAll() {
		ArrayList<Studentm> s = new ArrayList<Studentm>();
		carrier.findAll().forEach(entry -> s.add(entry));
		return s;
	}

}
