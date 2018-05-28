/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author phomolo
 */

@Entity
@Table(name="cic_entity")
public class Cic {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cicId;
    
    private String subject;
    private String body;
    
    private String cicType;
    private String sourceType;
   
    
    @ManyToOne
    @JoinColumn(name ="entityId")
    @JsonBackReference
    private Entities entity;

    private transient Long entities_id;
            
    public Cic(long cicId, String subject, String body, String cicType, String sourceType) {
        this.cicId = cicId;
        this.subject = subject;
        this.body = body;
        this.cicType = cicType;
        this.sourceType = sourceType;
     
    }

    public Cic() {
    }

    public long getCicId() {
        return cicId;
    }

    public void setCicId(long cicId) {
        this.cicId = cicId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCicType() {
        return cicType;
    }

    public void setCicType(String cicType) {
        this.cicType = cicType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }


    public Entities getEntity() {
        return entity;
    }

    public void setEntity(Entities entity) {
        this.entity = entity;
    }

    public Long getEntities_id() {
        return entities_id;
    }

    public void setEntities_id(Long entitties_id) {
        this.entities_id = entitties_id;
    }

    @Override
    public String toString() {
        return "Cic{" + "cicId=" + cicId + ", subject=" + subject + ", body=" + body + ", cicType=" + cicType + ", sourceType=" + sourceType + ", entity=" + entity + ", entities_id=" + entities_id + '}';
    }
    
     
    
}
