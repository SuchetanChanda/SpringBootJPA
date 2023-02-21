package com.suchetan;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.suchetan.dao.UserRepository;
import com.suchetan.entities.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		//Inserting single user
		
//		User user = new User();
//		user.setName("Suchetan");
//		user.setCity("Kolkata");
//		user.setStatus("Java Developer");
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
//		
//		-------------------------
		
		//Inserting multiple user
		
//		User user1 = new User();
//		user1.setName("Anurag");
//		user1.setCity("Mumbai");
//		user1.setStatus("Competitive Coder");
//		
//		User user2 = new User();
//		user2.setName("Nilisha");
//		user2.setCity("Dhanbaad");
//		user2.setStatus("DevOps");
//		
//		List<User> users = List.of(user1,user2);
//		userRepository.saveAll(users);
		
//		----------------------------------
		
		//Reading users
		
//		Iterable<User> users = userRepository.findAll();
//		users.forEach(user->System.out.println(user.toString()));

// 		-------------------------------
		
		//Updating users
		
//		Optional<User> optional = userRepository.findById(2);
//		User user2 = optional.get();
//		user2.setName("Roshan");
//		userRepository.save(user2);
//		Iterable<User> findAll = userRepository.findAll();
//		findAll.forEach(user->System.out.println(user));
		
		// ---------------------
		
		//Deleting users
		
		//single
//		userRepository.deleteById(3);
		
		//multiple
		
//		Iterable<User> findAll = userRepository.findAll();
//		userRepository.deleteAll(findAll);
		
		// Custom queries & JPQL
//				List<User> findByName = userRepository.findByName("Suchetan");
//				
//				findByName.forEach(e->{
//					System.out.println(e);
//				});
		
//				List<User> byName = userRepository.getByName("Anurag");
//				byName.forEach(e->{
//					System.out.println(e);
//				});
		
				// Native Query
		
//			List<User> byCity = userRepository.getByCity("Kolkata");
//			byCity.forEach(e->{
//				System.out.println(e);
//			});
	}

}
