package repo;

import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Student, Integer> {
}
