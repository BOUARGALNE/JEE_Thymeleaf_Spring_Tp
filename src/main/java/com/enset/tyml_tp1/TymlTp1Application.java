package com.enset.tyml_tp1;

import com.enset.tyml_tp1.entities.Patient;
import com.enset.tyml_tp1.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class TymlTp1Application {

	public static void main(String[] args) {

		SpringApplication.run(TymlTp1Application.class, args);
	}
	//@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
         patientRepository.save(new Patient(null,"hamid",new Date(),false,122));
		 patientRepository.save(new Patient(null,"brahim",new Date(),false,152));
		 patientRepository.save(new Patient(null,"lhoussayn",new Date(),false,120));
		 patientRepository.save(new Patient(null,"igna",new Date(),true,172));
		};
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
