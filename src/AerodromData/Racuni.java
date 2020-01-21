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
@Table(name = "RACUNI", catalog = "", schema = "QUANTUMAIR")
@NamedQueries({
    @NamedQuery(name = "Racuni.findAll", query = "SELECT r FROM Racuni r")
    , @NamedQuery(name = "Racuni.findByIdleta", query = "SELECT r FROM Racuni r WHERE r.idleta = :idleta")
    , @NamedQuery(name = "Racuni.findByVremekupovine", query = "SELECT r FROM Racuni r WHERE r.vremekupovine = :vremekupovine")
    , @NamedQuery(name = "Racuni.findByDatumkupovine", query = "SELECT r FROM Racuni r WHERE r.datumkupovine = :datumkupovine")
    , @NamedQuery(name = "Racuni.findByCenakarte", query = "SELECT r FROM Racuni r WHERE r.cenakarte = :cenakarte")})
public class Racuni implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDLETA")
    private Integer idleta;
    @Basic(optional = false)
    @Column(name = "VREMEKUPOVINE")
    @Temporal(TemporalType.TIME)
    private Date vremekupovine;
    @Basic(optional = false)
    @Column(name = "DATUMKUPOVINE")
    @Temporal(TemporalType.DATE)
    private Date datumkupovine;
    @Basic(optional = false)
    @Column(name = "CENAKARTE")
    private int cenakarte;

    public Racuni() {
    }

    public Racuni(Integer idleta) {
        this.idleta = idleta;
    }

    public Racuni(Integer idleta, Date vremekupovine, Date datumkupovine, int cenakarte) {
        this.idleta = idleta;
        this.vremekupovine = vremekupovine;
        this.datumkupovine = datumkupovine;
        this.cenakarte = cenakarte;
    }

    public Integer getIdleta() {
        return idleta;
    }

    public void setIdleta(Integer idleta) {
        Integer oldIdleta = this.idleta;
        this.idleta = idleta;
        changeSupport.firePropertyChange("idleta", oldIdleta, idleta);
    }

    public Date getVremekupovine() {
        return vremekupovine;
    }

    public void setVremekupovine(Date vremekupovine) {
        Date oldVremekupovine = this.vremekupovine;
        this.vremekupovine = vremekupovine;
        changeSupport.firePropertyChange("vremekupovine", oldVremekupovine, vremekupovine);
    }

    public Date getDatumkupovine() {
        return datumkupovine;
    }

    public void setDatumkupovine(Date datumkupovine) {
        Date oldDatumkupovine = this.datumkupovine;
        this.datumkupovine = datumkupovine;
        changeSupport.firePropertyChange("datumkupovine", oldDatumkupovine, datumkupovine);
    }

    public int getCenakarte() {
        return cenakarte;
    }

    public void setCenakarte(int cenakarte) {
        int oldCenakarte = this.cenakarte;
        this.cenakarte = cenakarte;
        changeSupport.firePropertyChange("cenakarte", oldCenakarte, cenakarte);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idleta != null ? idleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Racuni)) {
            return false;
        }
        Racuni other = (Racuni) object;
        if ((this.idleta == null && other.idleta != null) || (this.idleta != null && !this.idleta.equals(other.idleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AerodromData.Racuni[ idleta=" + idleta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
