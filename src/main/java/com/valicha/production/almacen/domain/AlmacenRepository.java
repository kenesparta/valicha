package com.valicha.production.almacen.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmacenRepository extends CrudRepository<Almacen,Long> {
}
