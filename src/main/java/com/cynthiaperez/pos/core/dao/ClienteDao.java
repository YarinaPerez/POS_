package com.cynthiaperez.pos.core.dao;

import com.cynthiaperez.pos.core.model.Cliente;
import java.util.List;

public interface ClienteDao {
    
    public List<Cliente> findAllCliente();
    public Cliente findById(String nitCliente);
    public void saveCliente(Cliente elemento);
    public void deleteCliente(Cliente elemento);
    public void updateCliente(Cliente elemento);    
}
