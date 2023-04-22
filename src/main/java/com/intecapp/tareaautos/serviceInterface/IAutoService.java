package com.intecapp.tareaautos.serviceInterface;

import com.intecapp.tareaautos.modelo.Auto;

import java.util.List;
import java.util.Optional;

public interface IAutoService {
    public List<Auto> listar();

    public Optional<Auto> listarId(int id);

    public int save(Auto a);

    public void delete(int id);
}
