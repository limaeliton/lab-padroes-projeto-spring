package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 */

/**
 * A camada de serviço é basicamente a camada de negócio é onde se cria as regras
 * e efetivamente implementar toda complexidade de integração,composição que geralmente é de
 * responsabilidade da FALSADE,
 */

// o cardápio é uma interface de comunicação entre o cliente  e os cozinheiros.
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);


}