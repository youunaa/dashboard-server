package com.okestro.server.batch.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "BATCH_STEP_EXECUTION")
@Table(name = "BATCH_STEP_EXECUTION")
public class BatchExecute {

    @Id
    @Column(name = "STEP_EXECUTION_ID")
    private Long stepExecutionId;

    @Column(name = "STEP_NAME")
    private String stepName;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "START_TIME")
    private String startTime;

    @Column(name = "END_TIME")
    private String endTime;

    @Column(name = "EXIT_MESSAGE")
    private String exitMessage;

    @Column(name = "EXIT_CODE")
    private String exitCode;

}
