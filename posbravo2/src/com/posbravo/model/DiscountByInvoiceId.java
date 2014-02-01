package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DiscountByInvoiceId generated by hbm2java
 */
@Embeddable
public class DiscountByInvoiceId implements java.io.Serializable {

	private Integer invoiceNo;
	private Integer promId;

	public DiscountByInvoiceId() {
	}

	public DiscountByInvoiceId(Integer invoiceNo, Integer promId) {
		this.invoiceNo = invoiceNo;
		this.promId = promId;
	}

	@Column(name = "InvoiceNo")
	public Integer getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	@Column(name = "PromId")
	public Integer getPromId() {
		return this.promId;
	}

	public void setPromId(Integer promId) {
		this.promId = promId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DiscountByInvoiceId))
			return false;
		DiscountByInvoiceId castOther = (DiscountByInvoiceId) other;

		return ((this.getInvoiceNo() == castOther.getInvoiceNo()) || (this
				.getInvoiceNo() != null && castOther.getInvoiceNo() != null && this
				.getInvoiceNo().equals(castOther.getInvoiceNo())))
				&& ((this.getPromId() == castOther.getPromId()) || (this
						.getPromId() != null && castOther.getPromId() != null && this
						.getPromId().equals(castOther.getPromId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getInvoiceNo() == null ? 0 : this.getInvoiceNo().hashCode());
		result = 37 * result
				+ (getPromId() == null ? 0 : this.getPromId().hashCode());
		return result;
	}

}