package In.NIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import In.NIT.Entity.Patient;
import In.NIT.Service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping
	public ResponseEntity<Patient> addPatient(@RequestBody Patient patient)
	{
		Patient savedPatient = patientService.addPatient(patient);
		return ResponseEntity.status(201).body(savedPatient);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Patient>> getPatients(@PathVariable Long userId)
	{
		List<Patient> patients = patientService.getPatientsByUserId(userId);
		if(patients.isEmpty())
		{
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(patients);
	}
}
