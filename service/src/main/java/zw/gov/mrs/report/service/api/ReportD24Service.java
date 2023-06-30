package zw.gov.mrs.report.service.api;

import zw.gov.mrs.report.domain.ReportD24DataView;
import zw.gov.mrs.report.dto.Report;

import java.util.List;

public interface ReportD24Service {
    int[] getTotalMalesAndFemalesInEachAgeRange(List<ReportD24DataView> list, int lowerAge, int upperAge);
    List<Report> getReportWithData();
}
