package com.intecapp.tareaautos.service;

import com.intecapp.tareaautos.modelo.Auto;
import com.intecapp.tareaautos.modeloDAO.IAuto;
import com.intecapp.tareaautos.serviceInterface.IAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService implements IAutoService {

    @Autowired
    private IAuto dao;

    @Override
    public List<Auto> listar() {
        return (List<Auto>) dao.findAll();
    }

    @Override
    public Optional<Auto> listarId(int id) {
        return dao.findById(id);
    }

    @Override
    public int save(Auto a) {
        int res=0;
        Auto au=dao.save(a);
        if(!au.equals(null)) {
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        dao.deleteById(id);
    }
}
