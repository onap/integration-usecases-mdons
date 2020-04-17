package org.onap.dcasimulator.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.onap.dcasimulator.utils.Utils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MsaController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/cxf/openroadm/openroadm-services/create")
	public String createService(@RequestBody String request) {

		String response = "{\"configuration-response-common\":{\"request-id\":\"987654321\",\"response-code\":\"200\",\"ack-final-indicator\":\"Y\",\"response-message\":\"SUCCESS\"}}";

		return response;

	}

	@DeleteMapping("/cxf/openroadm/openroadm-services/delete")
	public String deleteService() {

		String response = "{\"configuration-response-common\":{\"request-id\":\"987654321\",\"response-code\":\"200\",\"ack-final-indicator\":\"Y\",\"response-message\":\"SUCCESS\"}}";

		return response;
	}

	@GetMapping("/cxf/openroadm/v2/networks/otn-topology")
	public String getMsaTopology() {

		String topology = Utils.readFromFile("/opt/onap/dcasimulator/templates/msa-topology");

		return topology;
	}
}
