package zw.gov.mrs.report.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Report {
    private String dataPoint;
    private List<AgeRange> ageRanges;
}
