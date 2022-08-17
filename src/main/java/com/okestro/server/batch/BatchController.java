package com.okestro.server.batch;

import com.okestro.server.base.BaseController;
import com.okestro.server.base.BaseModel;
import com.okestro.server.base.BodyModel;
import com.okestro.server.batch.repository.BatchExecuteRepository;
import com.okestro.server.metric.repository.MetricRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/batch")
@CrossOrigin
@RequiredArgsConstructor
public class BatchController extends BaseController {

    final private BatchExecuteRepository batchExecuteRepository;

    final private MetricRepository metricRepository;

    /**
     * 배치 서버 execute 실행 결과
     * @return
     */
    @ResponseBody
    @GetMapping("/list")
    public BaseModel batchExecuteList() {
        BodyModel body = new BodyModel();

        body.setBody(batchExecuteRepository.findAll());
        return ok(body);
    }

    /**
     *
     * @return
     */
    @ResponseBody
    @GetMapping("/metric/list")
    public BaseModel MetricList() {
        BodyModel body = new BodyModel();

        body.setBody(metricRepository.findAll());
        return ok(body);
    }

}
