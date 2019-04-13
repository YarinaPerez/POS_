/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cynthiaperez.pos.core.dao;

import com.cynthiaperez.pos.core.db.Conexion;
import com.cynthiaperez.pos.core.model.Factura;
import java.util.List;

/**
 *
 * @author josebaten
 */
public class FacturaDaoImpl implements FacturaDao {

    @Override
    public List<Factura> findAllFactura() {
        return (List<Factura>)Conexion.getInstancia().findAll(Factura.class);
    }

    @Override
    public Factura findById(Long numeroFactura) {
        return (Factura)Conexion.getInstancia().findById(Factura.class, numeroFactura);
    }

    @Override
    public void saveFactura(Factura elemento) {
        Conexion.getInstancia().save(elemento);
    }

    @Override
    public void deleteFactura(Factura elemento) {
        Conexion.getInstancia().delete(elemento);
    }

    @Override
    public void updateFactura(Factura elemento) {
        Conexion.getInstancia().update(elemento);
    }
    
}
