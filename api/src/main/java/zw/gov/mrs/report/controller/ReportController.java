package zw.gov.mrs.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import zw.gov.mrs.report.dto.Report;
import zw.gov.mrs.report.service.api.ReportD24Service;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1")
public class ReportController {

    @Autowired
    private ReportD24Service reportD24Service;

    @RequestMapping(value = "/report", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Report>> getReportD24Result(){

        List<Report> report = reportD24Service.getReportWithData();
        return new ResponseEntity<>(report, HttpStatus.OK);
    }
}
