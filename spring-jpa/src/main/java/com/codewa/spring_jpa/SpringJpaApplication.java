package com.codewa.spring_jpa;

import com.codewa.spring_jpa.entities.Patient;
import com.codewa.spring_jpa.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		patientRepository.save(new Patient(null, "Anouar", new Date(), false, 50));
//		patientRepository.save(new Patient(null, "Fatima", new Date(), true, 30));
//		patientRepository.save(new Patient(null, "Khalil", new Date(), false, 80));
		//insert 99 new patients
//		for (int i = 1; i < 100; i++) {
//			patientRepository.save(new Patient(null, ("Khalil" + i), new Date(), false, (int) (Math.random() * 1000)));
//		}
//		List<Patient> patients = patientRepository.findAll();

		//find By Id
		//findById(1L).get(): if the element does not present NoSuchElementException will be raised
		//orElse(null): better but we need to check if the object is null or not before displaying data
		//orElseThrow(()-> new RuntimeException("Element Not Found"): if the element does not exist we throw an error msg, but we still need to verify
//		Patient patient = patientRepository.findById(1L).orElse(null);
//		if(patient != null) {
//			System.out.println("**************");
//			System.out.println(patient.getId());
//			System.out.println(patient.getName());
//			System.out.println(patient.getBirth());
//			System.out.println(patient.getScore());
//			System.out.println(patient.isSick());
//		}
		//update patient with id = 1
//		if(patient != null) {
//			patient.setScore(540);
//			patientRepository.save(patient);
//		}

		//delete patient with id = 10
//		patientRepository.deleteById(10L);

		//pagination: return the 5 first patients
		Page<Patient> patients = patientRepository.findAll(PageRequest.of(0, 5));
		patients.forEach(p -> {
			System.out.println("==============");
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getBirth());
			System.out.println(p.getScore());
			System.out.println(p.isSick());
		});
	}

}
