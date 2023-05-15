/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_lapangan;

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
 * @author LURY
 */
@Entity
@Table(name = "transaksilapangan", catalog = "database_lapangan", schema = "")
@NamedQueries({
    @NamedQuery(name = "Transaksilapangan.findAll", query = "SELECT t FROM Transaksilapangan t")
    , @NamedQuery(name = "Transaksilapangan.findByKodeBooking", query = "SELECT t FROM Transaksilapangan t WHERE t.kodeBooking = :kodeBooking")
    , @NamedQuery(name = "Transaksilapangan.findByIdLapangan", query = "SELECT t FROM Transaksilapangan t WHERE t.idLapangan = :idLapangan")
    , @NamedQuery(name = "Transaksilapangan.findByNama", query = "SELECT t FROM Transaksilapangan t WHERE t.nama = :nama")
    , @NamedQuery(name = "Transaksilapangan.findByNomerTelpon", query = "SELECT t FROM Transaksilapangan t WHERE t.nomerTelpon = :nomerTelpon")
    , @NamedQuery(name = "Transaksilapangan.findByTanggalBooking", query = "SELECT t FROM Transaksilapangan t WHERE t.tanggalBooking = :tanggalBooking")
    , @NamedQuery(name = "Transaksilapangan.findByTanggalMain", query = "SELECT t FROM Transaksilapangan t WHERE t.tanggalMain = :tanggalMain")
    , @NamedQuery(name = "Transaksilapangan.findByJamMulai", query = "SELECT t FROM Transaksilapangan t WHERE t.jamMulai = :jamMulai")
    , @NamedQuery(name = "Transaksilapangan.findByJamSelesai", query = "SELECT t FROM Transaksilapangan t WHERE t.jamSelesai = :jamSelesai")
    , @NamedQuery(name = "Transaksilapangan.findByTarif", query = "SELECT t FROM Transaksilapangan t WHERE t.tarif = :tarif")
    , @NamedQuery(name = "Transaksilapangan.findByDp", query = "SELECT t FROM Transaksilapangan t WHERE t.dp = :dp")
    , @NamedQuery(name = "Transaksilapangan.findByStatus", query = "SELECT t FROM Transaksilapangan t WHERE t.status = :status")})
public class Transaksilapangan implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_booking")
    private String kodeBooking;
    @Basic(optional = false)
    @Column(name = "id_lapangan")
    private String idLapangan;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "nomerTelpon")
    private String nomerTelpon;
    @Basic(optional = false)
    @Column(name = "tanggalBooking")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalBooking;
    @Basic(optional = false)
    @Column(name = "tanggalMain")
    @Temporal(TemporalType.DATE)
    private Date tanggalMain;
    @Basic(optional = false)
    @Column(name = "jamMulai")
    @Temporal(TemporalType.TIME)
    private Date jamMulai;
    @Basic(optional = false)
    @Column(name = "jamSelesai")
    @Temporal(TemporalType.TIME)
    private Date jamSelesai;
    @Basic(optional = false)
    @Column(name = "tarif")
    private int tarif;
    @Basic(optional = false)
    @Column(name = "dp")
    private int dp;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public Transaksilapangan() {
    }

    public Transaksilapangan(String kodeBooking) {
        this.kodeBooking = kodeBooking;
    }

    public Transaksilapangan(String kodeBooking, String idLapangan, String nama, String nomerTelpon, Date tanggalBooking, Date tanggalMain, Date jamMulai, Date jamSelesai, int tarif, int dp, String status) {
        this.kodeBooking = kodeBooking;
        this.idLapangan = idLapangan;
        this.nama = nama;
        this.nomerTelpon = nomerTelpon;
        this.tanggalBooking = tanggalBooking;
        this.tanggalMain = tanggalMain;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.tarif = tarif;
        this.dp = dp;
        this.status = status;
    }

    public String getKodeBooking() {
        return kodeBooking;
    }

    public void setKodeBooking(String kodeBooking) {
        String oldKodeBooking = this.kodeBooking;
        this.kodeBooking = kodeBooking;
        changeSupport.firePropertyChange("kodeBooking", oldKodeBooking, kodeBooking);
    }

    public String getIdLapangan() {
        return idLapangan;
    }

    public void setIdLapangan(String idLapangan) {
        String oldIdLapangan = this.idLapangan;
        this.idLapangan = idLapangan;
        changeSupport.firePropertyChange("idLapangan", oldIdLapangan, idLapangan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getNomerTelpon() {
        return nomerTelpon;
    }

    public void setNomerTelpon(String nomerTelpon) {
        String oldNomerTelpon = this.nomerTelpon;
        this.nomerTelpon = nomerTelpon;
        changeSupport.firePropertyChange("nomerTelpon", oldNomerTelpon, nomerTelpon);
    }

    public Date getTanggalBooking() {
        return tanggalBooking;
    }

    public void setTanggalBooking(Date tanggalBooking) {
        Date oldTanggalBooking = this.tanggalBooking;
        this.tanggalBooking = tanggalBooking;
        changeSupport.firePropertyChange("tanggalBooking", oldTanggalBooking, tanggalBooking);
    }

    public Date getTanggalMain() {
        return tanggalMain;
    }

    public void setTanggalMain(Date tanggalMain) {
        Date oldTanggalMain = this.tanggalMain;
        this.tanggalMain = tanggalMain;
        changeSupport.firePropertyChange("tanggalMain", oldTanggalMain, tanggalMain);
    }

    public Date getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(Date jamMulai) {
        Date oldJamMulai = this.jamMulai;
        this.jamMulai = jamMulai;
        changeSupport.firePropertyChange("jamMulai", oldJamMulai, jamMulai);
    }

    public Date getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(Date jamSelesai) {
        Date oldJamSelesai = this.jamSelesai;
        this.jamSelesai = jamSelesai;
        changeSupport.firePropertyChange("jamSelesai", oldJamSelesai, jamSelesai);
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        int oldTarif = this.tarif;
        this.tarif = tarif;
        changeSupport.firePropertyChange("tarif", oldTarif, tarif);
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        int oldDp = this.dp;
        this.dp = dp;
        changeSupport.firePropertyChange("dp", oldDp, dp);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeBooking != null ? kodeBooking.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksilapangan)) {
            return false;
        }
        Transaksilapangan other = (Transaksilapangan) object;
        if ((this.kodeBooking == null && other.kodeBooking != null) || (this.kodeBooking != null && !this.kodeBooking.equals(other.kodeBooking))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui_lapangan.Transaksilapangan[ kodeBooking=" + kodeBooking + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
