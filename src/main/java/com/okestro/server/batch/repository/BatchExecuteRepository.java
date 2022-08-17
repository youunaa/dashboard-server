package com.okestro.server.batch.repository;

import com.okestro.server.batch.model.BatchExecute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchExecuteRepository extends JpaRepository<BatchExecute, Long> {

//    List<BatchExecute> findAllByType(String userId, Pageable pageable);

}
