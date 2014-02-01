package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Invoice generated by hbm2java
 */
@Entity
@Table(name = "invoice", catalog = "posbravo")
public class Invoice implements java.io.Serializable {

	private Integer invoiceNo;
	private Date invoiceDate;
	private BigDecimal amount;
	private Date invoiceDueDate;
	private String promId;
	private Integer shippingClassId;
	private String tableId;
	private Integer partySize;

	public Invoice() {
	}

	public Invoice(Date invoiceDate, BigDecimal amount, Date invoiceDueDate,
			String promId, Integer shippingClassId, String tableId,
			Integer partySize) {
		this.invoiceDate = invoiceDate;
		this.amount = amount;
		this.invoiceDueDate = invoiceDueDate;
		this.promId = promId;
		this.shippingClassId = shippingClassId;
		this.tableId = tableId;
		this.partySize = partySize;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "InvoiceNo", unique = true, nullable = false)
	public Integer getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "InvoiceDate", length = 19)
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	@Column(name = "Amount", scale = 4)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "InvoiceDueDate", length = 19)
	public Date getInvoiceDueDate() {
		return this.invoiceDueDate;
	}

	public void setInvoiceDueDate(Date invoiceDueDate) {
		this.invoiceDueDate = invoiceDueDate;
	}

	@Column(name = "PromId")
	public String getPromId() {
		return this.promId;
	}

	public void setPromId(String promId) {
		this.promId = promId;
	}

	@Column(name = "ShippingClassID")
	public Integer getShippingClassId() {
		return this.shippingClassId;
	}

	public void setShippingClassId(Integer shippingClassId) {
		this.shippingClassId = shippingClassId;
	}

	@Column(name = "TableID")
	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	@Column(name = "PartySize")
	public Integer getPartySize() {
		return this.partySize;
	}

	public void setPartySize(Integer partySize) {
		this.partySize = partySize;
	}

}