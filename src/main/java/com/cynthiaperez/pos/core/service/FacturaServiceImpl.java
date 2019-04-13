/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cynthiaperez.pos.core.service;

import com.cynthiaperez.pos.core.dao.FacturaDao;
import com.cynthiaperez.pos.core.dao.FacturaDaoImpl;
import com.cynthiaperez.pos.core.model.Factura;
import java.util.List;

/**
 *
 * @author josebaten
 */
public class FacturaServiceImpl implements FacturaService {

    private final FacturaDao facturaDao = new FacturaDaoImpl();
    
    @Override
    public List<Factura> findAllFactura() {
        return facturaDao.findAllFactura();
    }

    @Override
    public Factura findById(Long numeroFactura) {
        return facturaDao.findById(numeroFactura);
    }

    @Override
    public void saveFactura(Factura elemento) {
        facturaDao.saveFactura(elemento);
    }

    @Override
    public void deleteFactura(Factura elemento) {
        facturaDao.deleteFactura(elemento);
    }

    @Override
    public void updateFactura(Factura elemento) {
        facturaDao.updateFactura(elemento);
    }
    
}
