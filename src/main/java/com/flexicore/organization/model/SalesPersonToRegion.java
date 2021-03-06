package com.flexicore.organization.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.model.Baseclass;
import com.flexicore.model.TimedLink;
import com.flexicore.security.SecurityContext;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SalesPersonToRegion extends TimedLink {

	public SalesPersonToRegion() {
	}

	public SalesPersonToRegion(String name, SecurityContext securityContext) {
		super(name, securityContext);
	}

	@Override
	@ManyToOne(targetEntity = SalesPerson.class, cascade = {CascadeType.MERGE,
			CascadeType.PERSIST})
	public SalesPerson getLeftside() {
		return (SalesPerson) super.getLeftside();
	}

	@JsonIgnore
	public void setLeftside(SalesPerson leftside) {
		super.setLeftside(leftside);
	}

	@Override
	public void setLeftside(Baseclass leftside) {
		super.setLeftside(leftside);
	}

	@Override
	@ManyToOne(targetEntity = SalesRegion.class, cascade = {CascadeType.MERGE,
			CascadeType.PERSIST})
	public SalesRegion getRightside() {
		return (SalesRegion) super.getRightside();
	}

	@JsonIgnore
	public void setRightside(SalesRegion rightside) {
		super.setRightside(rightside);
	}

	@Override
	public void setRightside(Baseclass rightside) {
		super.setRightside(rightside);
	}

}
