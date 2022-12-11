package com.gonzaga.banksystemv2.repositories;

import com.gonzaga.banksystemv2.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    Segunda "Classe", na verdade, "Interface".
    Ela irá "extender / herdar" de outra "interface" no caso JpaRepository,
    que possui os métodos que precisamos para fazer um CRUD (criar, ler, atualizar, deletar)
    Herança é representada por extends,
    seguida do nome da classe da qual se deseja herdar
 */

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
