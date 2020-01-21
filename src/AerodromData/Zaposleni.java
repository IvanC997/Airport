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
@Table(name = "ZAPOSLENI", catalog = "", schema = "QUANTUMAIR")
@NamedQueries({
    @NamedQuery(name = "Zaposleni.findAll", query = "SELECT z FROM Zaposleni z")
    , @NamedQuery(name = "Zaposleni.findById", query = "SELECT z FROM Zaposleni z WHERE z.id = :id")
    , @NamedQuery(name = "Zaposleni.findByImeiprezime", query = "SELECT z FROM Zaposleni z WHERE z.imeiprezime = :imeiprezime")
    , @NamedQuery(name = "Zaposleni.findByDatumzaposlenja", query = "SELECT z FROM Zaposleni z WHERE z.datumzaposlenja = :datumzaposlenja")
    , @NamedQuery(name = "Zaposleni.findByDatumprestankarada", query = "SELECT z FROM Zaposleni z WHERE z.datumprestankarada = :datumprestankarada")
    , @NamedQuery(name = "Zaposleni.findByKorisnickoime", query = "SELECT z FROM Zaposleni z WHERE z.korisnickoime = :korisnickoime")
    , @NamedQuery(name = "Zaposleni.findByLozinka", query = "SELECT z FROM Zaposleni z WHERE z.lozinka = :lozinka")
    , @NamedQuery(name = "Zaposleni.findByStatus", query = "SELECT z FROM Zaposleni z WHERE z.status = :status")})
public class Zaposleni implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "IMEIPREZIME")
    private String imeiprezime;
    @Basic(optional = false)
    @Column(name = "DATUMZAPOSLENJA")
    @Temporal(TemporalType.DATE)
    private Date datumzaposlenja;
    @Column(name = "DATUMPRESTANKARADA")
    @Temporal(TemporalType.DATE)
    private Date datumprestankarada;
    @Basic(optional = false)
    @Column(name = "KORISNICKOIME")
    private String korisnickoime;
    @Basic(optional = false)
    @Column(name = "LOZINKA")
    private String lozinka;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private int status;

    public Zaposleni() {
    }

    public Zaposleni(Integer id) {
        this.id = id;
    }

    public Zaposleni(Integer id, String imeiprezime, Date datumzaposlenja, String korisnickoime, String lozinka, int status) {
        this.id = id;
        this.imeiprezime = imeiprezime;
        this.datumzaposlenja = datumzaposlenja;
        this.korisnickoime = korisnickoime;
        this.lozinka = lozinka;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getImeiprezime() {
        return imeiprezime;
    }

    public void setImeiprezime(String imeiprezime) {
        String oldImeiprezime = this.imeiprezime;
        this.imeiprezime = imeiprezime;
        changeSupport.firePropertyChange("imeiprezime", oldImeiprezime, imeiprezime);
    }

    public Date getDatumzaposlenja() {
        return datumzaposlenja;
    }

    public void setDatumzaposlenja(Date datumzaposlenja) {
        Date oldDatumzaposlenja = this.datumzaposlenja;
        this.datumzaposlenja = datumzaposlenja;
        changeSupport.firePropertyChange("datumzaposlenja", oldDatumzaposlenja, datumzaposlenja);
    }

    public Date getDatumprestankarada() {
        return datumprestankarada;
    }

    public void setDatumprestankarada(Date datumprestankarada) {
        Date oldDatumprestankarada = this.datumprestankarada;
        this.datumprestankarada = datumprestankarada;
        changeSupport.firePropertyChange("datumprestankarada", oldDatumprestankarada, datumprestankarada);
    }

    public String getKorisnickoime() {
        return korisnickoime;
    }

    public void setKorisnickoime(String korisnickoime) {
        String oldKorisnickoime = this.korisnickoime;
        this.korisnickoime = korisnickoime;
        changeSupport.firePropertyChange("korisnickoime", oldKorisnickoime, korisnickoime);
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        String oldLozinka = this.lozinka;
        this.lozinka = lozinka;
        changeSupport.firePropertyChange("lozinka", oldLozinka, lozinka);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        int oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
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
        if (!(object instanceof Zaposleni)) {
            return false;
        }
        Zaposleni other = (Zaposleni) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AerodromData.Zaposleni[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
