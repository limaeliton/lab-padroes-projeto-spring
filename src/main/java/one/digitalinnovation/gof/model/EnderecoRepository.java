package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// EnderecoRepository  >> vai ser a interface que Prover todos os métodos de acesso a dados desse Entity
// o cardápio é uma interface de comunicação entre o cliente  e os cozinheiros.
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
