package com.okestro.server.metric.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MetricAvg {

    private String cpuAvg;
    private String memorySizeAvg;
    private String memoryTotalAvg;

}
