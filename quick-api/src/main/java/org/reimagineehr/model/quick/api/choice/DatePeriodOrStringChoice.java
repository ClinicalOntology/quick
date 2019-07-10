package org.reimagineehr.model.quick.api.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface DatePeriodOrStringChoice extends ChoiceElement {


		 Date getDate();

		 void setDate(Date arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 String getString();

		 void setString(String arg);

}