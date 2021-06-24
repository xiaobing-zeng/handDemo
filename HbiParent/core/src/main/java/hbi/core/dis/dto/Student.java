package hbi.core.dis.dto;

import com.hand.hap.mybatis.common.query.Comparison;
import com.hand.hap.mybatis.common.query.Where;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Table(
        name = "student_info"
)
public class Student extends BaseDTO {
    @Id
    @GeneratedValue
    private Long sid;
    @NotEmpty
    @Where(
            comparison = Comparison.LIKE
    )
    @Length(
            max = 50
    )
    private String sname;
    @NotEmpty
    private Long sage;
    @Length(
            max = 1
    )
    @OrderBy
    private String ssex;
    @Length(
            max = 11
    )
    @OrderBy
    private Long sphone;
    @Email
    @Length(
            max = 50
    )
    @OrderBy
    private String semail;
    @OrderBy
    @Transient
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sbirthday;

    public Student() {
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Long getSage() {
        return sage;
    }

    public void setSage(Long sage) {
        this.sage = sage;
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public Long getSphone() {
        return sphone;
    }

    public void setSphone(Long sphone) {
        this.sphone = sphone;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
}
