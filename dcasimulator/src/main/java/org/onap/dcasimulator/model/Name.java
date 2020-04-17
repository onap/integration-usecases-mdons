package org.onap.dcasimulator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {

	@JsonProperty(value = "value-name")
	private String valueName;

	private String value;

	public String getValueName() {
		return valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
