package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.backbone.HumanName;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Contact extends BackboneElement {


		 HumanName getName();

		 void setName(HumanName arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 Address getAddress();

		 void setAddress(Address arg);

}