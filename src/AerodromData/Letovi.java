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
@Table(name = "LETOVI", catalog = "", schema = "QUANTUMAIR")
@NamedQueries({
    @NamedQuery(name = "Letovi.findAll", query = "SELECT l FROM Letovi l")
    , @NamedQuery(name = "Letovi.findByIdleta", query = "SELECT l FROM Letovi l WHERE l.idleta = :idleta")
    , @NamedQuery(name = "Letovi.findByIdaviona", query = "SELECT l FROM Letovi l WHERE l.idaviona = :idaviona")
    , @NamedQuery(name = "Letovi.findByCompanycode", query = "SELECT l FROM Letovi l WHERE l.companycode = :companycode")
    , @NamedQuery(name = "Letovi.findByOd", query = "SELECT l FROM Letovi l WHERE l.od = :od")
    , @NamedQuery(name = "Letovi.findByDo1", query = "SELECT l FROM Letovi l WHERE l.do1 = :do1")
    , @NamedQuery(name = "Letovi.findByKapija", query = "SELECT l FROM Letovi l WHERE l.kapija = :kapija")
    , @NamedQuery(name = "Letovi.findByPolazak", query = "SELECT l FROM Letovi l WHERE l.polazak = :polazak")
    , @NamedQuery(name = "Letovi.findByDolazak", query = "SELECT l FROM Letovi l WHERE l.dolazak = :dolazak")
    , @NamedQuery(name = "Letovi.findByCenakarte", query = "SELECT l FROM Letovi l WHERE l.cenakarte = :cenakarte")})
public class Letovi implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDLETA")
    private Integer idleta;
    @Basic(optional = false)
    @Column(name = "IDAVIONA")
    private int idaviona;
    @Basic(optional = false)
    @Column(name = "COMPANYCODE")
    private String companycode;
    @Basic(optional = false)
    @Column(name = "OD")
    private String od;
    @Basic(optional = false)
    @Column(name = "DO")
    private String do1;
    @Basic(optional = false)
    @Column(name = "KAPIJA")
    private int kapija;
    @Basic(optional = false)
    @Column(name = "POLAZAK")
    @Temporal(TemporalType.TIME)
    private Date polazak;
    @Basic(optional = false)
    @Column(name = "DOLAZAK")
    @Temporal(TemporalType.TIME)
    private Date dolazak;
    @Basic(optional = false)
    @Column(name = "CENAKARTE")
    private int cenakarte;

    public Letovi() {
    }

    public Letovi(Integer idleta) {
        this.idleta = idleta;
    }

    public Letovi(Integer idleta, int idaviona, String companycode, String od, String do1, int kapija, Date polazak, Date dolazak, int cenakarte) {
        this.idleta = idleta;
        this.idaviona = idaviona;
        this.companycode = companycode;
        this.od = od;
        this.do1 = do1;
        this.kapija = kapija;
        this.polazak = polazak;
        this.dolazak = dolazak;
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

    public int getIdaviona() {
        return idaviona;
    }

    public void setIdaviona(int idaviona) {
        int oldIdaviona = this.idaviona;
        this.idaviona = idaviona;
        changeSupport.firePropertyChange("idaviona", oldIdaviona, idaviona);
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        String oldCompanycode = this.companycode;
        this.companycode = companycode;
        changeSupport.firePropertyChange("companycode", oldCompanycode, companycode);
    }

    public String getOd() {
        return od;
    }

    public void setOd(String od) {
        String oldOd = this.od;
        this.od = od;
        changeSupport.firePropertyChange("od", oldOd, od);
    }

    public String getDo1() {
        return do1;
    }

    public void setDo1(String do1) {
        String oldDo1 = this.do1;
        this.do1 = do1;
        changeSupport.firePropertyChange("do1", oldDo1, do1);
    }

    public int getKapija() {
        return kapija;
    }

    public void setKapija(int kapija) {
        int oldKapija = this.kapija;
        this.kapija = kapija;
        changeSupport.firePropertyChange("kapija", oldKapija, kapija);
    }

    public Date getPolazak() {
        return polazak;
    }

    public void setPolazak(Date polazak) {
        Date oldPolazak = this.polazak;
        this.polazak = polazak;
        changeSupport.firePropertyChange("polazak", oldPolazak, polazak);
    }

    public Date getDolazak() {
        return dolazak;
    }

    public void setDolazak(Date dolazak) {
        Date oldDolazak = this.dolazak;
        this.dolazak = dolazak;
        changeSupport.firePropertyChange("dolazak", oldDolazak, dolazak);
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
        if (!(object instanceof Letovi)) {
            return false;
        }
        Letovi other = (Letovi) object;
        if ((this.idleta == null && other.idleta != null) || (this.idleta != null && !this.idleta.equals(other.idleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AerodromData.Letovi[ idleta=" + idleta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
