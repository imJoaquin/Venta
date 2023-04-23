package com.example.Productos.Repository;

import com.example.Productos.Entity.UnidadDeMedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadMedidaRepository extends JpaRepository<UnidadDeMedida, Integer> {
}
