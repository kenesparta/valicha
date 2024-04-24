package com.valicha.production.sede.domain.repository;

import com.valicha.production.sede.domain.Sede;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends CrudRepository<Sede,Long> {
}
