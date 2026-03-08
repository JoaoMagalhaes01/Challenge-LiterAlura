
package com.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.literalura.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
