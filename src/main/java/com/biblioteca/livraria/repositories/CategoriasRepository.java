/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.biblioteca.livraria.repositories;

import com.biblioteca.livraria.models.CategoriasModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabriel
 */
@Repository
public interface CategoriasRepository extends JpaRepository<CategoriasModel, UUID>{
    
    CategoriasModel findByNome(String nome);
}
