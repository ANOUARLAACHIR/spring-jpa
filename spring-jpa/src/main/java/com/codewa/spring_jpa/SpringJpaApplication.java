package com.codewa.spring_jpa;

import com.codewa.spring_jpa.entities.Patient;
import com.codewa.spring_jpa.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null, "Anouar", new Date(), false, 50));
		patientRepository.save(new Patient(null, "Fatima", new Date(), true, 30));
		patientRepository.save(new Patient(null, "Khalil", new Date(), false, 80));
	}
}
