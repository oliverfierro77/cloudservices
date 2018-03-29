package corp.sodimac.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVA_HDR")
public class Reserva {

    public Reserva() {}
   
    /*public Reserva(String firstName) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
    }*/

	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUM_RESERVA")
    private int numReserva;

    @Column(name = "CANAL_VENTA")
    private Long canalVenta;

    @Column(name = "COD_ESTADOCAB")
    private Long codEstadoCab;

    @Column(name = "ORG_LVL_NUMBER")
    private Long orgLvlNumber;

    @Column(name = "NUM_ORDENVENTA")
    private Long numOrdenVenta;

    @Column(name = "FECHA_RESERVA")
    private Date fechaReserva;

    @Column(name = "FECHA_PAGO")
    private Date fechaPago;

    @Column(name = "ID_VENDEDOR")
    private Long idVendedor;

    @Column(name = "TYPE_DOC")
    private String typeDoc;

    @Column(name = "NUM_DOC")
    private String numDoc;

    @Column(name = "MONTO")
    private Long monto;

    @Column(name = "DOC_DATE")
    private Date docDate;

    @Column(name = "NUM_CAJA")
    private Long numCaja;

    @Column(name = "TYPE_IDE")
    private String typeIde;

    @Column(name = "IDE")
    private Long ide;

    @Column(name = "IDE_DV")
    private String ideDv;

    @Column(name = "REGION_CLI")
    private String regionCli;

    @Column(name = "CIUDAD_CLI")
    private String ciudadCli;

    @Column(name = "COMUNA_CLI")
    private String comunaCli;

    @Column(name = "COMUNA_CLITIPO")
    private String comunaCliTipo;

    @Column(name = "NOMBRE_CLI")
    private String nombreCli;

    @Column(name = "DIRECCION_CLI")
    private String direccionCli;

    @Column(name = "FONO_CLI")
    private String fonoCli;

    @Column(name = "REGION_DESP")
    private String regionDesp;

    @Column(name = "CIUDAD_DESP")
    private String ciudadDesp;

    @Column(name = "COMUNA_DESP")
    private String comunaDesp;

    @Column(name = "COMUNA_DESPTIPO")
    private String comunaDespTipo;

    @Column(name = "DIRECCION_DESP")
    private String direccionDesp;

    @Column(name = "NOMBRE_DESP")
    private String nombreDesp;

    @Column(name = "FONO_DESP")
    private String fonoDesp;

    @Column(name = "FONO2_DESP")
    private String fono2Desp;

    @Column(name = "OBSERVACION")
    private String observacion;

    @Column(name = "DESACTIVADO")
    private Long desactivado;

    @Column(name = "TS")
    private Long ts;

    @Column(name = "MARCA_GUIA")
    private String marcaGuia;

    @Column(name = "CAMPO1")
    private String campo1;

    @Column(name = "CAMPO2")
    private String campo2;

    @Column(name = "CAMPO3")
    private String campo3;

    @Column(name = "CAMPO4")
    private String campo4;

    @Column(name = "CAMPO5")
    private String campo5;

    @Column(name = "CAMPO6")
    private String campo6;

    @Column(name = "CAMPO7")
    private String campo7;

    @Column(name = "CAMPO8")
    private String campo8;

    @Column(name = "CAMPO9")
    private String campo9;

    @Column(name = "CAMPO10")
    private String campo10;

    @Column(name = "BULTOS")
    private Long bultos;

    @Column(name = "BLOQUEO")
    private String bloqueo;

    @Column(name = "NUMRSV_PADRE")
    private Long numRsvPadre;

    @Column(name = "TIPO_RT")
    private String tipoRt;

    @Column(name = "TIPO_CANJE")
    private String tipoCanje;

    @Column(name = "COD_POSTAL")
    private String codPostal;

    @Column(name = "PISO_DESP")
    private String pisoDesp;

    @Column(name = "BARRIO_CERRADO_DESP")
    private String barrioCerradoDesp;

    @Column(name = "LOTE_DESP")
    private String loteDesp;

    @Column(name = "ENTRE_CALLE_Y_CALLE_DESP")
    private String entreCalleYCalleDesp;

    @Column(name = "RT_PREPARADO")
    private Long rtPreparado;

    @Column(name = "E_MAIL")
    private String email;

    @Column(name = "CALLE_NORMALIZADA")
    private String calleNormalizada;

    @Column(name = "ENTRE_CALLE_NORMALIZADA")
    private String entreCalleNormalizada;

    @Column(name = "NUM_PUERTA_NORMALIZADA")
    private String numPuertaNormalizada;

    @Column(name = "COMUNA_NORMALIZADA")
    private String comunaNormalizada;

    @Column(name = "REGION_NORMALIZADA")
    private String regionNormalizada;

    @Column(name = "LATITUD")
    private String latitud;

    @Column(name = "LONGITUD")
    private String longitud;

    @Column(name = "MONTO_DESP")
    private Long montoDesp;

    @Column(name = "TIPO_RESERVA")
    private String tipoReserva;

    @Column(name = "FECHA_CREA")
    private Date fechaCrea;

    @Column(name = "FECHA_CONFIRMA")
    private Date fechaConfirma;

    @Column(name = "CORREO_CLI")
    private String correoCli;

    @Column(name = "IDE_CLI_TER")
    private Long ideCliTer;

    @Column(name = "IDE_DV_CLI_TER")
    private String ideDvCliTer;

    public Long getCanalVenta() {
		return canalVenta;
	}

	public void setCanalVenta(Long canalVenta) {
		this.canalVenta = canalVenta;
	}

	public int getNumReserva() {
		return numReserva;
	}

	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}

	public Long getCodEstadoCab() {
		return codEstadoCab;
	}

	public void setCodEstadoCab(Long codEstadoCab) {
		this.codEstadoCab = codEstadoCab;
	}

	public Long getOrgLvlNumber() {
		return orgLvlNumber;
	}

	public void setOrgLvlNumber(Long orgLvlNumber) {
		this.orgLvlNumber = orgLvlNumber;
	}

	public Long getNumOrdenVenta() {
		return numOrdenVenta;
	}

	public void setNumOrdenVenta(Long numOrdenVenta) {
		this.numOrdenVenta = numOrdenVenta;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Long getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Long idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getTypeDoc() {
		return typeDoc;
	}

	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public Long getMonto() {
		return monto;
	}

	public void setMonto(Long monto) {
		this.monto = monto;
	}

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public Long getNumCaja() {
		return numCaja;
	}

	public void setNumCaja(Long numCaja) {
		this.numCaja = numCaja;
	}

	public String getTypeIde() {
		return typeIde;
	}

	public void setTypeIde(String typeIde) {
		this.typeIde = typeIde;
	}

	public Long getIde() {
		return ide;
	}

	public void setIde(Long ide) {
		this.ide = ide;
	}

	public String getIdeDv() {
		return ideDv;
	}

	public void setIdeDv(String ideDv) {
		this.ideDv = ideDv;
	}

	public String getRegionCli() {
		return regionCli;
	}

	public void setRegionCli(String regionCli) {
		this.regionCli = regionCli;
	}

	public String getCiudadCli() {
		return ciudadCli;
	}

	public void setCiudadCli(String ciudadCli) {
		this.ciudadCli = ciudadCli;
	}

	public String getComunaCli() {
		return comunaCli;
	}

	public void setComunaCli(String comunaCli) {
		this.comunaCli = comunaCli;
	}

	public String getComunaCliTipo() {
		return comunaCliTipo;
	}

	public void setComunaCliTipo(String comunaCliTipo) {
		this.comunaCliTipo = comunaCliTipo;
	}

	public String getNombreCli() {
		return nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public String getDireccionCli() {
		return direccionCli;
	}

	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}

	public String getFonoCli() {
		return fonoCli;
	}

	public void setFonoCli(String fonoCli) {
		this.fonoCli = fonoCli;
	}

	public String getRegionDesp() {
		return regionDesp;
	}

	public void setRegionDesp(String regionDesp) {
		this.regionDesp = regionDesp;
	}

	public String getCiudadDesp() {
		return ciudadDesp;
	}

	public void setCiudadDesp(String ciudadDesp) {
		this.ciudadDesp = ciudadDesp;
	}

	public String getComunaDesp() {
		return comunaDesp;
	}

	public void setComunaDesp(String comunaDesp) {
		this.comunaDesp = comunaDesp;
	}

	public String getComunaDespTipo() {
		return comunaDespTipo;
	}

	public void setComunaDespTipo(String comunaDespTipo) {
		this.comunaDespTipo = comunaDespTipo;
	}

	public String getDireccionDesp() {
		return direccionDesp;
	}

	public void setDireccionDesp(String direccionDesp) {
		this.direccionDesp = direccionDesp;
	}

	public String getNombreDesp() {
		return nombreDesp;
	}

	public void setNombreDesp(String nombreDesp) {
		this.nombreDesp = nombreDesp;
	}

	public String getFonoDesp() {
		return fonoDesp;
	}

	public void setFonoDesp(String fonoDesp) {
		this.fonoDesp = fonoDesp;
	}

	public String getFono2Desp() {
		return fono2Desp;
	}

	public void setFono2Desp(String fono2Desp) {
		this.fono2Desp = fono2Desp;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Long getDesactivado() {
		return desactivado;
	}

	public void setDesactivado(Long desactivado) {
		this.desactivado = desactivado;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public String getMarcaGuia() {
		return marcaGuia;
	}

	public void setMarcaGuia(String marcaGuia) {
		this.marcaGuia = marcaGuia;
	}

	public String getCampo1() {
		return campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public String getCampo2() {
		return campo2;
	}

	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}

	public String getCampo3() {
		return campo3;
	}

	public void setCampo3(String campo3) {
		this.campo3 = campo3;
	}

	public String getCampo4() {
		return campo4;
	}

	public void setCampo4(String campo4) {
		this.campo4 = campo4;
	}

	public String getCampo5() {
		return campo5;
	}

	public void setCampo5(String campo5) {
		this.campo5 = campo5;
	}

	public String getCampo6() {
		return campo6;
	}

	public void setCampo6(String campo6) {
		this.campo6 = campo6;
	}

	public String getCampo7() {
		return campo7;
	}

	public void setCampo7(String campo7) {
		this.campo7 = campo7;
	}

	public String getCampo8() {
		return campo8;
	}

	public void setCampo8(String campo8) {
		this.campo8 = campo8;
	}

	public String getCampo9() {
		return campo9;
	}

	public void setCampo9(String campo9) {
		this.campo9 = campo9;
	}

	public String getCampo10() {
		return campo10;
	}

	public void setCampo10(String campo10) {
		this.campo10 = campo10;
	}

	public Long getBultos() {
		return bultos;
	}

	public void setBultos(Long bultos) {
		this.bultos = bultos;
	}

	public String getBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(String bloqueo) {
		this.bloqueo = bloqueo;
	}

	public Long getNumRsvPadre() {
		return numRsvPadre;
	}

	public void setNumRsvPadre(Long numRsvPadre) {
		this.numRsvPadre = numRsvPadre;
	}

	public String getTipoRt() {
		return tipoRt;
	}

	public void setTipoRt(String tipoRt) {
		this.tipoRt = tipoRt;
	}

	public String getTipoCanje() {
		return tipoCanje;
	}

	public void setTipoCanje(String tipoCanje) {
		this.tipoCanje = tipoCanje;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getPisoDesp() {
		return pisoDesp;
	}

	public void setPisoDesp(String pisoDesp) {
		this.pisoDesp = pisoDesp;
	}

	public String getBarrioCerradoDesp() {
		return barrioCerradoDesp;
	}

	public void setBarrioCerradoDesp(String barrioCerradoDesp) {
		this.barrioCerradoDesp = barrioCerradoDesp;
	}

	public String getLoteDesp() {
		return loteDesp;
	}

	public void setLoteDesp(String loteDesp) {
		this.loteDesp = loteDesp;
	}

	public String getEntreCalleYCalleDesp() {
		return entreCalleYCalleDesp;
	}

	public void setEntreCalleYCalleDesp(String entreCalleYCalleDesp) {
		this.entreCalleYCalleDesp = entreCalleYCalleDesp;
	}

	public Long getRtPreparado() {
		return rtPreparado;
	}

	public void setRtPreparado(Long rtPreparado) {
		this.rtPreparado = rtPreparado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCalleNormalizada() {
		return calleNormalizada;
	}

	public void setCalleNormalizada(String calleNormalizada) {
		this.calleNormalizada = calleNormalizada;
	}

	public String getEntreCalleNormalizada() {
		return entreCalleNormalizada;
	}

	public void setEntreCalleNormalizada(String entreCalleNormalizada) {
		this.entreCalleNormalizada = entreCalleNormalizada;
	}

	public String getNumPuertaNormalizada() {
		return numPuertaNormalizada;
	}

	public void setNumPuertaNormalizada(String numPuertaNormalizada) {
		this.numPuertaNormalizada = numPuertaNormalizada;
	}

	public String getComunaNormalizada() {
		return comunaNormalizada;
	}

	public void setComunaNormalizada(String comunaNormalizada) {
		this.comunaNormalizada = comunaNormalizada;
	}

	public String getRegionNormalizada() {
		return regionNormalizada;
	}

	public void setRegionNormalizada(String regionNormalizada) {
		this.regionNormalizada = regionNormalizada;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public Long getMontoDesp() {
		return montoDesp;
	}

	public void setMontoDesp(Long montoDesp) {
		this.montoDesp = montoDesp;
	}

	public String getTipoReserva() {
		return tipoReserva;
	}

	public void setTipoReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

	public Date getFechaCrea() {
		return fechaCrea;
	}

	public void setFechaCrea(Date fechaCrea) {
		this.fechaCrea = fechaCrea;
	}

	public Date getFechaConfirma() {
		return fechaConfirma;
	}

	public void setFechaConfirma(Date fechaConfirma) {
		this.fechaConfirma = fechaConfirma;
	}

	public String getCorreoCli() {
		return correoCli;
	}

	public void setCorreoCli(String correoCli) {
		this.correoCli = correoCli;
	}

	public Long getIdeCliTer() {
		return ideCliTer;
	}

	public void setIdeCliTer(Long ideCliTer) {
		this.ideCliTer = ideCliTer;
	}

	public String getIdeDvCliTer() {
		return ideDvCliTer;
	}

	public void setIdeDvCliTer(String ideDvCliTer) {
		this.ideDvCliTer = ideDvCliTer;
	}    

}