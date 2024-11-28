package In.NIT.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import In.NIT.Entity.Patient;
import In.NIT.Repo.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
    public Patient addPatient(Patient patient)
    {
		return patientRepository.save(patient);
    }
    
    public List<Patient> getPatientsByUserId(Long userId)
    {
		return patientRepository.findByuserId(userId);	
    }
}
