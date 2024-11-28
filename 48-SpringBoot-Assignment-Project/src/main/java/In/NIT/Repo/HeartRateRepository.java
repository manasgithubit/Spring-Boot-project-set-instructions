package In.NIT.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import In.NIT.Entity.HeartRate;

public interface HeartRateRepository extends JpaRepository<HeartRate, Long>{

	List<HeartRate> findBypatientId(Long patientId);
}
