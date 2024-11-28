package In.NIT.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import In.NIT.Entity.HeartRate;
import In.NIT.Repo.HeartRateRepository;

@Service
public class HeartRateService {

	@Autowired
	private HeartRateRepository heartRateRepository;
	
	public HeartRate recordHeartRate(HeartRate HeartRate)
	{
		return heartRateRepository.save(HeartRate);
	}
	
	public List<HeartRate> getHeartRatesByPatientId(Long patientId)
	{
		return heartRateRepository.findBypatientId(patientId);
	}
}
