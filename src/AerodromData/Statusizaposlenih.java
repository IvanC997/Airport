/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AerodromData;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Ivan
 */
@Entity
@Table(name = "STATUSIZAPOSLENIH", catalog = "", schema = "QUANTUMAIR")
@NamedQueries({
    @NamedQuery(name = "Statusizaposlenih.findAll", query = "SELECT s FROM Statusizaposlenih s")
    , @NamedQuery(name = "Statusizaposlenih.findById", query = "SELECT s FROM Statusizaposlenih s WHERE s.id = :id")
    , @NamedQuery(name = "Statusizaposlenih.findByDatum", query = "SELECT s FROM Statusizaposlenih s WHERE s.datum = :datum")
    , @NamedQuery(name = "Statusizaposlenih.findByVreme", query = "SELECT s FROM Statusizaposlenih s WHERE s.vreme = :vreme")
    , @NamedQuery(name = "Statusizaposlenih.findByIdstatusa", query = "SELECT s FROM Statusizaposlenih s WHERE s.idstatusa = :idstatusa")})
public class Statusizaposlenih implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "DATUM")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Basic(optional = false)
    @Column(name = "VREME")
    @Temporal(TemporalType.TIME)
    private Date vreme;
    @Basic(optional = false)
    @Column(name = "IDSTATUSA")
    private Boolean idstatusa;

    public Statusizaposlenih() {
    }

    public Statusizaposlenih(Integer id) {
        this.id = id;
    }

    public Statusizaposlenih(Integer id, Date datum, Date vreme, Boolean idstatusa) {
        this.id = id;
        this.datum = datum;
        this.vreme = vreme;
        this.idstatusa = idstatusa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        Date oldDatum = this.datum;
        this.datum = datum;
        changeSupport.firePropertyChange("datum", oldDatum, datum);
    }

    public Date getVreme() {
        return vreme;
    }

    public void setVreme(Date vreme) {
        Date oldVreme = this.vreme;
        this.vreme = vreme;
        changeSupport.firePropertyChange("vreme", oldVreme, vreme);
    }

    public Boolean getIdstatusa() {
        return idstatusa;
    }

    public void setIdstatusa(Boolean idstatusa) {
        Boolean oldIdstatusa = this.idstatusa;
        this.idstatusa = idstatusa;
        changeSupport.firePropertyChange("idstatusa", oldIdstatusa, idstatusa);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statusizaposlenih)) {
            return false;
        }
        Statusizaposlenih other = (Statusizaposlenih) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AerodromData.Statusizaposlenih[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
