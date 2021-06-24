package hbi.core.des.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "DES_CREDIT")
public class Credit extends BaseDTO {

     public static final String FIELD_CREDITID = "creditid";
     public static final String FIELD_SID = "sid";
     public static final String FIELD_SUBJECTNUM = "subjectnum";
     public static final String FIELD_SUBJECTNAME = "subjectname";
     public static final String FIELD_TOTALCREDITS = "totalcredits";


     @Id
     @GeneratedValue
     private Float creditid;

     private Float sid;

     @Length(max = 30)
     private String subjectnum;

     @Length(max = 30)
     private String subjectname;

     private Float totalcredits;


     public void setCreditid(Float creditid){
         this.creditid = creditid;
     }

     public Float getCreditid(){
         return creditid;
     }

     public void setSid(Float sid){
         this.sid = sid;
     }

     public Float getSid(){
         return sid;
     }

     public void setSubjectnum(String subjectnum){
         this.subjectnum = subjectnum;
     }

     public String getSubjectnum(){
         return subjectnum;
     }

     public void setSubjectname(String subjectname){
         this.subjectname = subjectname;
     }

     public String getSubjectname(){
         return subjectname;
     }

     public void setTotalcredits(Float totalcredits){
         this.totalcredits = totalcredits;
     }

     public Float getTotalcredits(){
         return totalcredits;
     }

     }
