package com.admin.dao;

import com.admin.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author flori
 */

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}
