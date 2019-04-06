package com.cynthiaperez.pos.core.dao;

import com.cynthiaperez.pos.core.db.Conexion;
import com.cynthiaperez.pos.core.model.Proveedor;
import java.util.List;

public class ProveedorDaoImp implements ProveedorDao {

    // Implementacion de todos los metodos que declare en interfaz ProveedorDao
    @Override
    public List<Proveedor> finAllProveedor() {
        return (List<Proveedor>)Conexion.getInstancia().findAll(Proveedor.class);
    }

    @Override
    public Proveedor findById(Long codigoProveedor) {
        return (Proveedor)Conexion.getInstancia().findById(Proveedor.class, codigoProveedor);
    }

    @Override
    public void saveProveedor(Proveedor elemento) {
        Conexion.getInstancia().save(elemento);
    }

    @Override
    public void deleteProveedor(Proveedor elemento) {
        Conexion.getInstancia().delete(elemento);
    }

    @Override
    public void updateProveedor(Proveedor elemento) {
        Conexion.getInstancia().update(elemento);
    }
    
}
