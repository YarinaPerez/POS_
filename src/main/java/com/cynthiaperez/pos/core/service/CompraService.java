package com.cynthiaperez.pos.core.service;

import com.cynthiaperez.pos.core.model.Compra;
import java.util.List;

public interface CompraService {
    
    public List<Compra> findAllCompra();
    public Compra findById(Long idCompra);
    public void saveCompra(Compra elemento);
    public void deleteCompra(Compra elemento);
    public void updateCompra(Compra elemento);    
    
}
