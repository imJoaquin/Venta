package com.example.Ventas.Repository;

import com.example.Ventas.Entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
