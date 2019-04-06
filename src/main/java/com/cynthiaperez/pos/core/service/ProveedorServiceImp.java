package com.cynthiaperez.pos.core.service;

import com.cynthiaperez.pos.core.dao.ProveedorDao;
import com.cynthiaperez.pos.core.dao.ProveedorDaoImp;
import com.cynthiaperez.pos.core.model.Proveedor;
import java.util.List;

public class ProveedorServiceImp implements ProveedorService {
    
    private ProveedorDao proveedorDao = new ProveedorDaoImp(); // Crear la instancia para poder invocar los metodos de ProveedorDao

    @Override
    public List<Proveedor> finAllProveedor() {
        return proveedorDao.finAllProveedor();
    }

    @Override
    public Proveedor findById(Long codigoProveedor) {
        return proveedorDao.findById(codigoProveedor);
    }

    @Override
    public void saveProveedor(Proveedor elemento) {
        proveedorDao.saveProveedor(elemento);
    }

    @Override
    public void deleteProveedor(Proveedor elemento) {
        proveedorDao.deleteProveedor(elemento);
    }

    @Override
    public void updateProveedor(Proveedor elemento) {
        proveedorDao.updateProveedor(elemento);
    }
    
}
