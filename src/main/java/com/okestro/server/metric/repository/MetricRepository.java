package com.okestro.server.metric.repository;

import com.okestro.server.metric.model.Metric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricRepository extends JpaRepository<Metric, Long> {

}
