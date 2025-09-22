package com.java10x.user_registration.infrastructure.repository;

import com.java10x.user_registration.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    @Transactional // Caso der algum erro, não será deletado
    void deleteByEmail(String email);

}
