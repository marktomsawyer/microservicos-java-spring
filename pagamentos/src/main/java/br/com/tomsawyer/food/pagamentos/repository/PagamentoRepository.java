package br.com.tomsawyer.food.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tomsawyer.food.pagamentos.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
