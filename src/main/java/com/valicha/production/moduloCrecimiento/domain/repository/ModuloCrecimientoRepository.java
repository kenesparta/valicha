package com.valicha.production.moduloCrecimiento.domain.repository;

import com.valicha.production.moduloCrecimiento.domain.ModuloCrecimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloCrecimientoRepository extends CrudRepository<ModuloCrecimiento,Long> {
}
