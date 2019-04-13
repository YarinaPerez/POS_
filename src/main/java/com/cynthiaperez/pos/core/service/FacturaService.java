package com.cynthiaperez.pos.core.service;

import com.cynthiaperez.pos.core.model.Factura;
import java.util.List;


public interface FacturaService {     
    
    public List<Factura> findAllFactura();
    public Factura findById(Long numeroFactura);
    public void saveFactura(Factura elemento);
    public void deleteFactura(Factura elemento);
    public void updateFactura(Factura elemento);
   
}
