package one.digitalinnovation.gof.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


    @Query(value = "SELECT * FROM tb_clientes as c WHERE c.cep = :cep",
            nativeQuery = true)
    List<Cliente> findByCep(@Param("cep") String cep);

}