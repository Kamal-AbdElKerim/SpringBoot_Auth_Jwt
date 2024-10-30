package com.PigeonSkyRace.Auth.repository;

import java.util.Optional;

import com.PigeonSkyRace.Auth.models.ERole;
import com.PigeonSkyRace.Auth.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
