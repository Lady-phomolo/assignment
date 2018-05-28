/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import static java.lang.reflect.Array.set;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;
/**
 *
 * @author phomolo
 */
@Entity
@Table(name = "entity")
public class Entities {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
   
    private long entityId;

    private String entityName;

    private String emailAddress;
    
    @JsonIgnore
    @OneToMany(targetEntity = Cic.class , mappedBy="entity" , fetch =FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<Cic>cic;
    
    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Entities() {
    }

    public Set<Cic> getCic() {
        return cic;
    }

    public void setCic(Set<Cic> cic) {
        this.cic = cic;
    }

    @Override
    public String toString() {
        return "Entities{" + "entityId=" + entityId + ", entityName=" + entityName + ", emailAddress=" + emailAddress + ", cic=" + cic + '}';
    }
    

}
