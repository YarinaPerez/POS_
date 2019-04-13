package com.cynthiaperez.pos.core.service;

import com.cynthiaperez.pos.core.dao.ClienteDao;
import com.cynthiaperez.pos.core.dao.ClienteDaoImpl;
import com.cynthiaperez.pos.core.model.Cliente;
import java.util.List;

public class ClienteServiceImpl  implements ClienteService {
    
    private final ClienteDao clienteDao = new ClienteDaoImpl();
    
    @Override
    public List<Cliente> findAllCliente() {
        return clienteDao.findAllCliente();
    }

    @Override
    public Cliente findById(String nitCliente) {
        return clienteDao.findById(nitCliente);
    }

    @Override
    public void saveCliente(Cliente elemento) {
        clienteDao.saveCliente(elemento);
    }

    @Override
    public void deleteCliente(Cliente elemento) {
        clienteDao.deleteCliente(elemento);
    }

    @Override
    public void updateCliente(Cliente elemento) {
        clienteDao.updateCliente(elemento);
    }
    
}
