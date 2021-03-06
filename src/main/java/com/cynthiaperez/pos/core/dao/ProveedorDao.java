package com.cynthiaperez.pos.core.dao;

import com.cynthiaperez.pos.core.model.Proveedor;
import java.util.List;

public interface ProveedorDao {

    public List<Proveedor> finAllProveedor();

    public Proveedor findById(Long codigoProveedor);

    public void saveProveedor(Proveedor elemento);

    public void deleteProveedor(Proveedor elemento);

    public void updateProveedor(Proveedor elemento);
}
