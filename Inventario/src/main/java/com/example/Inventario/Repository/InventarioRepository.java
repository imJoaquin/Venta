package com.example.Inventario.Repository;

import com.example.Inventario.Entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
}
