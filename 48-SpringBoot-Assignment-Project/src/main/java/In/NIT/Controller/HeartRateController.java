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

import In.NIT.Entity.HeartRate;
import In.NIT.Service.HeartRateService;

@RestController
@RequestMapping("/heartRates")
public class HeartRateController {

	@Autowired
	private HeartRateService heartRateService;
	
	@PostMapping
	public ResponseEntity<HeartRate> recordHeartRate(@RequestBody HeartRate heraHeartRate)
	{
		HeartRate savedHeartRate = heartRateService.recordHeartRate(heraHeartRate);
		return ResponseEntity.status(201).body(savedHeartRate);
	}
	
	@GetMapping("/{patientId}")
	public ResponseEntity<List<HeartRate>> getHeartRates(@PathVariable Long patientId)
	{
		List<HeartRate> heartRates = heartRateService.getHeartRatesByPatientId(patientId);
        if (heartRates.isEmpty()) {
            return ResponseEntity.noContent().build();  // Optional: Return 204 No Content if no heart rates are found
        }
		return ResponseEntity.ok(heartRates);
	}
}
