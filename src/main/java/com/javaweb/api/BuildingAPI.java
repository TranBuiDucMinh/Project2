package com.javaweb.api;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.BuildingDTO;
import com.javaweb.model.ErrorResponseDTO;
import com.javaweb.service.BuildingService;

import customexception.FieldRequiredException;

@RestController
public class BuildingAPI {
	@Autowired
	private BuildingService buildingService;
	@GetMapping(value = "/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam(name="name",required = false) String name,
			@RequestParam(name="districtid",required = false) Long district,
			@RequestParam(name="typeCode",required = false) List<String> typeCode) {
		List<BuildingDTO> result = buildingService.findAll(name,district);	
	    return result;
	}
//	@PostMapping(value = "/api/building/")
//	public Object getBuilding(@RequestBody BuildingDTO buildingDTO) {
//		try {
//			System.out.print(5/0);
//			valiDate(buildingDTO);
//		}catch(Exception e){
//			ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
//			errorResponseDTO.setError(e.getMessage());
//			List<String> details = new ArrayList<>();
//			details.add("Check lại name hoac nummberofbasement di boi vi dang bị null dó");
//			errorResponseDTO.setDetail(details);
//			return errorResponseDTO;
//		}
//		List<BuildingDTO> listBuildings = new ArrayList<>();
//		BuildingDTO buildingDTO1 = new BuildingDTO();
//		buildingDTO1.setName("ABC Building");
//		buildingDTO1.setNumberOfBasement(3);
//		buildingDTO1.setWard("Tan Mai");
//		BuildingDTO buildingDTO2 = new BuildingDTO();
//		buildingDTO2.setName("ABC Tower");
//		buildingDTO2.setNumberOfBasement(2);
//		buildingDTO2.setWard("Da Cao");
//		listBuildings.add(buildingDTO1);
//		listBuildings.add(buildingDTO2);
//		return listBuildings;
//		valiDate(buildingDTO);
//		return null;
//	}
	
//	public void valiDate(BuildingDTO buildingDTO){
//		if(buildingDTO.getName() == null || buildingDTO.getName().equals("") || buildingDTO.getNumberOfBasement() == null) {
//			throw new FieldRequiredException("Name or numberofbasement is null");
//		}
//	}
	
//	@PostMapping(value = "/api/building/")
//	public void getBuilding2(@RequestBody BuildingDTO buildingDTO) {
//		System.out.print("OK");
//	}
	
//	@DeleteMapping(value= "/api/building/{id}/{name}")
//	public void deleteBuilding(@PathVariable Integer id, @PathVariable String name,
//			@RequestParam(value="ward", required = false) String ward) {
//		System.out.print("Da xoa toa nha co id = " + id +"rồi nhé");
//	}
	
}