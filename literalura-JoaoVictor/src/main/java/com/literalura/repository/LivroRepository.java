
package com.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.literalura.model.Livro;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByIdioma(String idioma);
}
