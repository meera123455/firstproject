package Student.StudentRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Student.StudentModel.Studentm;

@Repository
public interface Studentr extends CrudRepository<Studentm,Integer>{

}
