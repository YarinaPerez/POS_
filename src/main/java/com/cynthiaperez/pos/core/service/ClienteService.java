package com.cynthiaperez.pos.core.service;

import com.cynthiaperez.pos.core.model.Cliente;
import java.util.List;

public interface ClienteService {
    public List<Cliente> findAllCliente();
    public Cliente findById(String nitCliente);
    public void saveCliente(Cliente elemento);
    public void deleteCliente(Cliente elemento);
    public void updateCliente(Cliente elemento);    
    
}
