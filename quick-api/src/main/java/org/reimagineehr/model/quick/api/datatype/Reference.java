package org.reimagineehr.model.quick.api.datatype;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Reference extends Datatype {


		 String getReference();

		 void setReference(String arg);

		 String getType();

		 void setType(String arg);

		 Identifier getIdentifier();

		 void setIdentifier(Identifier arg);

		 String getDisplay();

		 void setDisplay(String arg);

}