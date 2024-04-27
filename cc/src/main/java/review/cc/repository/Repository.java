package review.cc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import review.cc.model.Model;

public interface Repository extends JpaRepository<Model,String>{

    // Model  findByModelemail (String email);
    Optional<Model> findByEmail(String email);
}
