package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import java.lang.String;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ContactPointImpl extends BackboneElementImpl implements ContactPoint {

	private String system;
	private String value;
	private String use;
	private Integer rank;
	private Period period;

	public String getSystem() {
		return this.system;
	}

	public void setSystem(String arg) {
		this.system=arg;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String arg) {
		this.value=arg;
	}

	public String getUse() {
		return this.use;
	}

	public void setUse(String arg) {
		this.use=arg;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer arg) {
		this.rank=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

}