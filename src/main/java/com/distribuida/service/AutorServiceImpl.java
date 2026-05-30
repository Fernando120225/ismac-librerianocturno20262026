package com.distribuida.service;

import com.distribuida.dao.AutorDAO;
import com.distribuida.model.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService{

    @Autowired
    private AutorDAO autorDAO;

    @Override
    public List<Autor> findAll() {
        return autorDAO.findAll();
    }

    @Override
    public Autor findOne(int id) {
        return autorDAO.findById(id).orElse(null);
    }

    @Override
    public Autor save(Autor autor) {
        return autorDAO.save(autor);
    }

    @Override
    public Autor update(int id, Autor autor) {

        Autor autorExistente = findOne(id);

        if (autorExistente == null){
            return null;
        }

        autorExistente.setNombre(autor.getNombre());
        autorExistente.setApellido(autor.getApellido());
        autorExistente.setCorreo(autor.getCorreo());
        autorExistente.setDireccion(autor.getDireccion());
        autorExistente.setPais(autor.getPais());
        autorExistente.setTelefono(autor.getTelefono());

        return autorDAO.save(autorExistente);
    }

    @Override
    public void delete(int id) {
        if (autorDAO.existsById(id)){
            autorDAO.deleteById(id);
        }
    }
}
