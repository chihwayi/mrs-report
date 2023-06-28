package zw.gov.mrs.report;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class ReportsApplication {
    public static void main(String[] args){SpringApplication.run(ReportsApplication.class, args);}
}
