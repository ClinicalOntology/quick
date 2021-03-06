package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;
import org.reimagineehr.model.quick.api.finding.Finding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface AssertionalFinding extends Finding {


		 Party getAsserter();

		 void setAsserter(Party arg);

		 Date getAssertedDate();

		 void setAssertedDate(Date arg);

}