package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.RecordLink;
import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class RecordLinkImpl extends BackboneElementImpl implements RecordLink {

	private IndividualCareRecipient other;
	private String type;

	public IndividualCareRecipient getOther() {
		return this.other;
	}

	public void setOther(IndividualCareRecipient arg) {
		this.other=arg;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String arg) {
		this.type=arg;
	}

}