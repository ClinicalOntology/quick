package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Eligibility;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class EligibilityImpl extends BackboneElementImpl implements Eligibility {

	private CodeableConcept code;
	private String comment;

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String arg) {
		this.comment=arg;
	}

}