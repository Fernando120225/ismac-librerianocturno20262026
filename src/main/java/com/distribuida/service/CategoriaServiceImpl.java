package com.distribuida.service;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaDAO categoriaDAO;

    @Override
    public List<Categoria> findAll() {
        return categoriaDAO.findAll();
    }

    @Override
    public Categoria findOne(int id) {return categoriaDAO.findById(id).orElse(null);}

    @Override
    public Categoria save(Categoria categoria) {return categoriaDAO.save(categoria);}

    @Override
    public Categoria update(int id, Categoria categoria) {
        Categoria categoriaExistente = findOne(id);

        if (categoriaExistente == null){
            return null;
        }

        categoriaExistente.setCategoria(categoria.getCategoria());
        categoriaExistente.setDescripcion(categoria.getDescripcion());

        return categoriaDAO.save(categoriaExistente);
    }

    @Override
    public void delete(int id) {
        if (categoriaDAO.existsById(id)) {
            categoriaDAO.deleteById(id);
        }
    }
}