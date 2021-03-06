package org.reimagineehr.model.quick.api.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DateCodeableConceptChoice extends ChoiceElement {


		 Date getDate();

		 void setDate(Date arg);

		 CodeableConcept getCodeableConcept();

		 void setCodeableConcept(CodeableConcept arg);

}