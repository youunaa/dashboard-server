package com.okestro.server.metric;

import com.okestro.server.base.BaseController;
import com.okestro.server.base.BaseModel;
import com.okestro.server.base.BodyModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/metric")
@CrossOrigin
@RestController
public class MetricController extends BaseController {

    private final MetricService metricService;

    @GetMapping("/total")
    public BaseModel metricTotal() {
        BodyModel body = new BodyModel();
        body.setBody(metricService.metricTotal());
        return ok(body);
    }

}
