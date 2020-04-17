package org.onap.dcasimulator.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sip {

	@JsonProperty(value = "administrative-state")
	private String administrativeState;

	@JsonProperty(value = "lifecycle-state")
	private String lifecycleState;

	@JsonProperty(value = "layer-protocol-name")
	private String layerProtocolName;

	private List<Name> name;

	private String uuid;

	public String getAdministrativeState() {
		return administrativeState;
	}

	public void setAdministrativeState(String administrativeState) {
		this.administrativeState = administrativeState;
	}

	public String getLifecycleState() {
		return lifecycleState;
	}

	public void setLifecycleState(String lifecycleState) {
		this.lifecycleState = lifecycleState;
	}

	public String getLayerProtocolName() {
		return layerProtocolName;
	}

	public void setLayerProtocolName(String layerProtocolName) {
		this.layerProtocolName = layerProtocolName;
	}

	public List<Name> getName() {
		return name;
	}

	public void setName(List<Name> name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
