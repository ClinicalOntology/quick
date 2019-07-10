package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class RangeImpl extends DatatypeImpl implements Range {

	private SimpleQuantity low;
	private SimpleQuantity high;

	public SimpleQuantity getLow() {
		return this.low;
	}

	public void setLow(SimpleQuantity arg) {
		this.low=arg;
	}

	public SimpleQuantity getHigh() {
		return this.high;
	}

	public void setHigh(SimpleQuantity arg) {
		this.high=arg;
	}

}