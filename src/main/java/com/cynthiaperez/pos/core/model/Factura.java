package com.cynthiaperez.pos.core.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // defino que va a ser una entidad
@Table(name="factura")
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //llave primaria
    @Column(name="numero_factura")
    private Long idFactura; 
    
    @ManyToOne(fetch=FetchType.LAZY) //muchos a uno
    @JoinColumn(name="nit")
    private Cliente cliente; 
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="total")
    private Double total;

    public Factura() {
    }

    public Factura(Long idFactura, Cliente cliente, Date fecha, Double total) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.fecha = fecha;
        this.total = total;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
}
