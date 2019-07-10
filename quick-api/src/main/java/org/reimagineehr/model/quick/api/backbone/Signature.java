package org.reimagineehr.model.quick.api.backbone;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.util.Date;
import org.reimagineehr.model.quick.api.party.Party;
import java.lang.String;
import java.lang.Byte;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Signature extends BackboneElement {


		 List<Coding> getType();

		 void setType(List<Coding> arg);

		public void addType(Coding arg);

		 Date getWhen();

		 void setWhen(Date arg);

		 Party getWho();

		 void setWho(Party arg);

		 Party getOnBehalfOf();

		 void setOnBehalfOf(Party arg);

		 String getTargetFormat();

		 void setTargetFormat(String arg);

		 String getSigFormat();

		 void setSigFormat(String arg);

		 Byte[] getData();

		 void setData(Byte[] arg);

}