package zw.gov.mrs.report.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "report_d24dataview")
@Immutable
public class ReportD24DataView implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String art_id;

    private String art_cohort_number;
    private String art_number;
    private LocalDate birth_date;
    private LocalDate date_enrolled;
    private String person_id;
    private String sex;
    private int year;
    private String adverse_event_status_id;
    private String adverse_event_status;
    private LocalDate date;
    private int month;
    private String reason_id;
    private String reason;
    private String reason_for_regimen_substitution_id;
    private String reason_for_regimen_substitution;
    private String regimen_id;
    private String regimen;
    private String treatment_failure_reason_id;
    private String treatment_failure_reason;
    private int age;
    private int count;
}
