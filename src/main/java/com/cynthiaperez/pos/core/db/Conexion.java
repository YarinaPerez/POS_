package com.cynthiaperez.pos.core.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Conexion { // Patron para que una vez se cree la instancia de la conexion
    private static Conexion instancia;
    private final String PERSISTENCE_UNIT_NAME = "POSPU"; // declarar una constante
    private EntityManager em; // Gestiona lo que se hara a la BD, transacciones
    
    public Conexion(){
        try{
            em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static Conexion getInstancia(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    // Create 
    public void save(Object elemento){ //objeto tipo Object
        try{
            em.getTransaction().begin();
            em.persist(elemento); //permite almacenar del lado de la bd
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }
    
    // Update
    public void update(Object elemento){
        try{
            em.getTransaction().begin();
            em.merge(elemento);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }
    
    // Delete
    public void delete(Object elemento){
        try{
            em.getTransaction().begin();
            em.remove(elemento);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }
    
    // Select
    public List<?> findAll(Class<?> elemento){ // Lista Generica
        // return em.createNamedQuery("Proveedor.findAll").getResultList();
        int posicion = elemento.getTypeName().indexOf("."); // devuelve Proveedor.class
        String clase = elemento.getTypeName().substring(0, posicion);
        return em.createNamedQuery(clase.concat(".findAll")).getResultList();
    }
    
    // Uso de SobreCarga de Metodos
    // Select con ID
    public Object findById(Class<?> clase, Long id){
        return em.find(clase.getClass(), id);
    }
    
    public Object findById(Class<?> clase, String id){
        return em.find(clase.getClass(), id);        
    }
    
    public EntityManager getEm(){
        return this.em;
    }
}

// Crear Proyecto: 
// Crear dependencias, luego modelos de datos, archivo de Persistence, conexion, controladores, vistas
// Reflection = permite leer los metodos de las clases