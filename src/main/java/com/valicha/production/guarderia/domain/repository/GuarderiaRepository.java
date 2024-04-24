package com.valicha.production.guarderia.domain.repository;

import com.valicha.production.guarderia.domain.Guarderia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuarderiaRepository  extends CrudRepository<Guarderia,Long> {
}
