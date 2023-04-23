package com.example.Ventas.Repository;

import com.example.Ventas.Entity.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle,Integer> {
}
