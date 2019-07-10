package org.reimagineehr.model.quick.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Coding;
import java.lang.String;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class CodingWrapper implements Coding {

	private org.hl7.fhir.dstu3.model.Coding adaptee;

	public CodingWrapper() {
	
	}

	public CodingWrapper(org.hl7.fhir.dstu3.model.Coding adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Coding getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Coding arg) {
		this.adaptee=arg;
	}

	public String getSystem() {
	return this.adaptee.getSystemElement().getValue();
	}

	public void setSystem(String arg) {
	this.adaptee.setSystem(arg);
	}

	public String getVersion() {
	return this.adaptee.getVersionElement().getValue();
	}

	public void setVersion(String arg) {
	this.adaptee.setVersion(arg);
	}

	public String getCode() {
	return this.adaptee.getCodeElement().getValue();
	}

	public void setCode(String arg) {
	this.adaptee.setCode(arg);
	}

	public String getDisplay() {
	return this.adaptee.getDisplayElement().getValue();
	}

	public void setDisplay(String arg) {
	this.adaptee.setDisplay(arg);
	}

	public Boolean getUserSelected() {
	return this.adaptee.getUserSelectedElement().getValue();
	}

	public void setUserSelected(Boolean arg) {
	this.adaptee.setUserSelected(arg);
	}

}