package one.digitalinnovation.gof.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

    @Modifying
    @Query(value = "DELETE FROM tb_endeceros as e" +
            "WHERE e.cep = cep",
            nativeQuery = true)
    void deletar(@Param("cep") String cep);
}