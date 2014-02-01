package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResidenceId generated by hbm2java
 */
@Embeddable
public class ResidenceId implements java.io.Serializable {

	private Integer addressId;
	private Integer customerId;

	public ResidenceId() {
	}

	public ResidenceId(Integer addressId, Integer customerId) {
		this.addressId = addressId;
		this.customerId = customerId;
	}

	@Column(name = "AddressId")
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "CustomerID")
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResidenceId))
			return false;
		ResidenceId castOther = (ResidenceId) other;

		return ((this.getAddressId() == castOther.getAddressId()) || (this
				.getAddressId() != null && castOther.getAddressId() != null && this
				.getAddressId().equals(castOther.getAddressId())))
				&& ((this.getCustomerId() == castOther.getCustomerId()) || (this
						.getCustomerId() != null
						&& castOther.getCustomerId() != null && this
						.getCustomerId().equals(castOther.getCustomerId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAddressId() == null ? 0 : this.getAddressId().hashCode());
		result = 37
				* result
				+ (getCustomerId() == null ? 0 : this.getCustomerId()
						.hashCode());
		return result;
	}

}