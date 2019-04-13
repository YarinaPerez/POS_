package com.cynthiaperez.pos.core.dao;

import com.cynthiaperez.pos.core.db.Conexion;
import com.cynthiaperez.pos.core.model.Cliente;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao {

    @Override
    public List<Cliente> findAllCliente() {
        return (List<Cliente>)Conexion.getInstancia().findAll(Cliente.class);
    }

    @Override
    public Cliente findById(String nitCliente) {
         return (Cliente)Conexion.getInstancia().findById(Cliente.class, nitCliente);
    }

    @Override
    public void saveCliente(Cliente elemento) {
        Conexion.getInstancia().save(elemento);
    }

    @Override
    public void deleteCliente(Cliente elemento) {
        Conexion.getInstancia().delete(elemento);
    }

    @Override
    public void updateCliente(Cliente elemento) {
        Conexion.getInstancia().update(elemento);
    }
    
}
