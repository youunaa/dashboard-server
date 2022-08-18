package com.okestro.server.metric.repository;

import com.okestro.server.metric.model.Metric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MetricRepository extends JpaRepository<Metric, Long> {

    @Query("SELECT AVG(m.value) FROM metric m WHERE m.type = 'CPU'")
    public String selectCpuAvg();

    @Query("SELECT AVG(m.value) FROM metric m WHERE m.type = 'MemorySize'")
    public String selectMemorySizeAvg();

    @Query("SELECT AVG(m.value) FROM metric m WHERE m.type = 'MemoryTotal'")
    public String selectMemoryTotalAvg();

}
