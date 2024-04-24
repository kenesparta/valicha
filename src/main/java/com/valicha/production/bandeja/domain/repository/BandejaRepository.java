package com.valicha.production.bandeja.domain.repository;

import com.valicha.production.bandeja.domain.Bandeja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandejaRepository extends CrudRepository<Bandeja,Long> {
}
