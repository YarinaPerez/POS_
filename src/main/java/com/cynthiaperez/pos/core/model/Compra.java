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
@Table(name="compra")
public class Compra implements Serializable { // la clase va a ser serializable para marshalin y unmarshaling
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //llave primaria
    @Column(name="id_compra")
    private Long idCompra;
    
    @Column(name="numero_documento")
    private Long numeroDocumento;
    
    @ManyToOne(fetch=FetchType.LAZY) //muchos a uno
    @JoinColumn(name="codigo_proveedor")
    private Proveedor proveedor;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="total")
    private Double total;

    // Constructor
    public Compra() {
    }

    public Compra(Long idCompra, Long numeroDocumento, Proveedor proveedor, Date fecha, Double total) {
        this.idCompra = idCompra;
        this.numeroDocumento = numeroDocumento;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.total = total;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    //Get y Set
    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    } 

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
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
