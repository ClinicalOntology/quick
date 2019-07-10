package org.reimagineehr.model.quick.api.resource;

import org.reimagineehr.model.quick.api.datatype.Narrative;
import org.reimagineehr.model.quick.api.resource.Resource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface DomainResource extends Resource {


		 Narrative getText();

		 void setText(Narrative arg);

}