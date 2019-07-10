package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.GroupMember;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class GroupMemberImpl extends BackboneElementImpl implements GroupMember {

	private Party entity;
	private Period period;
	private Boolean inactive;

	public Party getEntity() {
		return this.entity;
	}

	public void setEntity(Party arg) {
		this.entity=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public Boolean getInactive() {
		return this.inactive;
	}

	public void setInactive(Boolean arg) {
		this.inactive=arg;
	}

}