package In.NIT.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import In.NIT.Entity.Patient;
 
public interface PatientRepository extends  JpaRepository<Patient, Long>{

	List<Patient> findByuserId(Long userId);
} 
