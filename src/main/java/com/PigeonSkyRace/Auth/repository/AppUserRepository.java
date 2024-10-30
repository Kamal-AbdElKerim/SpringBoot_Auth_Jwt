package com.PigeonSkyRace.Auth.repository;

import java.util.Optional;

import com.PigeonSkyRace.Auth.models.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppUserRepository extends MongoRepository<AppUser, String> {
  AppUser findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);

  AppUser findByEmail(String email);
}
