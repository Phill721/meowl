package com.Producto.meowl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Producto.meowl.model.Producto;
import com.Producto.meowl.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto crearProducto(Producto p1){
        System.out.println("Pico pal que lee");
        return productoRepository.save(p1);
    }

    public Optional<Producto> buscarID(int id){
        return productoRepository.findById(id);
    }

    public List<Producto> listaProductos(){
        return productoRepository.findAll();
    }

    public Optional<Producto> actualizarProducto(int id, Producto actualizado){
        return productoRepository.findById(id).map(producto -> {
            producto.setId(id);
            producto.setNombre(actualizado.getNombre());
            producto.setCategoria(actualizado.getCategoria());
            producto.setPrecio(actualizado.getPrecio());
            producto.setStock(actualizado.getStock());
            return productoRepository.save(producto);
        });
    }

    public void eliminarProducto(int id){
        productoRepository.deleteById(id);
    }

}
