package class2.day2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import class2.day2.model.Model;

public interface Repository extends JpaRepository<Model,Integer>
{

}
