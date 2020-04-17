package org.onap.dcasimulator.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

import org.onap.dcasimulator.model.SipList;
import org.onap.dcasimulator.service.TapiService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TapiController {

	@Autowired
	TapiService tapiService;

	@GetMapping("/cxf/tapi/v2/connectivities/service-interface-points/{connection-point}")
	public SipList getTapiServiceInterfacePoint(@PathVariable("connection-point") String cep) {

		return tapiService.getServiceInterfacePoints(cep);

	}

	@PostMapping("/cxf/tapi/v2/connectivities/create-service/{service-name}")
	public String createTapiService(@PathVariable("service-name") String name, @RequestBody String requestbody) {
		tapiService.processService(requestbody);
		return "Service created Successfully";
	}

	@GetMapping("/cxf/tapi/v2/connectivities/get-service/{service-name}")
	public String getTapiService(@PathVariable("service-name") String name) {

		return tapiService.returnService(name);

	}

	@DeleteMapping("/cxf/tapi/v2/connectivities/delete-service/{service-name}")
	public String deleteTapiService(@PathVariable("service-name") String name) {
		tapiService.processDeleteService(name);
		String response = "Service deleted successfully";
		return response;

	}
	

	@GetMapping("/cxf/tapi/v2/connectivities/topology")
	public String getTapiTopology() {

		return tapiService.getTopology();

	}

}

