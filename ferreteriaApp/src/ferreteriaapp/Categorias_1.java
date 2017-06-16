/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteriaapp;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mau
 */
@Entity
@Table(name = "categorias", catalog = "ferreteria", schema = "")
@NamedQueries({
    @NamedQuery(name = "Categorias_1.findAll", query = "SELECT c FROM Categorias_1 c")
    , @NamedQuery(name = "Categorias_1.findByIDcatego", query = "SELECT c FROM Categorias_1 c WHERE c.iDcatego = :iDcatego")
    , @NamedQuery(name = "Categorias_1.findByNomcatego", query = "SELECT c FROM Categorias_1 c WHERE c.nomcatego = :nomcatego")
    , @NamedQuery(name = "Categorias_1.findByNomProdu", query = "SELECT c FROM Categorias_1 c WHERE c.nomProdu = :nomProdu")
    , @NamedQuery(name = "Categorias_1.findByStock", query = "SELECT c FROM Categorias_1 c WHERE c.stock = :stock")})
public class Categorias_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_catego")
    private Integer iDcatego;
    @Basic(optional = false)
    @Column(name = "Nom_catego")
    private String nomcatego;
    @Basic(optional = false)
    @Column(name = "Nom_Produ")
    private String nomProdu;
    @Basic(optional = false)
    @Column(name = "Stock")
    private String stock;

    public Categorias_1() {
    }

    public Categorias_1(Integer iDcatego) {
        this.iDcatego = iDcatego;
    }

    public Categorias_1(Integer iDcatego, String nomcatego, String nomProdu, String stock) {
        this.iDcatego = iDcatego;
        this.nomcatego = nomcatego;
        this.nomProdu = nomProdu;
        this.stock = stock;
    }

    public Integer getIDcatego() {
        return iDcatego;
    }

    public void setIDcatego(Integer iDcatego) {
        Integer oldIDcatego = this.iDcatego;
        this.iDcatego = iDcatego;
        changeSupport.firePropertyChange("IDcatego", oldIDcatego, iDcatego);
    }

    public String getNomcatego() {
        return nomcatego;
    }

    public void setNomcatego(String nomcatego) {
        String oldNomcatego = this.nomcatego;
        this.nomcatego = nomcatego;
        changeSupport.firePropertyChange("nomcatego", oldNomcatego, nomcatego);
    }

    public String getNomProdu() {
        return nomProdu;
    }

    public void setNomProdu(String nomProdu) {
        String oldNomProdu = this.nomProdu;
        this.nomProdu = nomProdu;
        changeSupport.firePropertyChange("nomProdu", oldNomProdu, nomProdu);
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        String oldStock = this.stock;
        this.stock = stock;
        changeSupport.firePropertyChange("stock", oldStock, stock);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDcatego != null ? iDcatego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorias_1)) {
            return false;
        }
        Categorias_1 other = (Categorias_1) object;
        if ((this.iDcatego == null && other.iDcatego != null) || (this.iDcatego != null && !this.iDcatego.equals(other.iDcatego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ferreteriaapp.Categorias_1[ iDcatego=" + iDcatego + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
