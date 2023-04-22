package com.intecapp.tareaautos.modeloDAO;

import com.intecapp.tareaautos.modelo.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuto extends CrudRepository<Auto, Integer> {

}
