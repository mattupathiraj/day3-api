package com.example.demo.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.Employee;
import com.example.demo.Service.ApiService;
@RestController
public class ApiController {
	
	@Autowired //extends another class
	ApiService stuService;
	@PostMapping("/addDetails")
	public Employee addInfo(@RequestBody Employee st)
	{
		return stuService.saveDetails(st);
		}@GetMapping("/showDetails")
		public List<Employee>fetchDetails(){
			return stuService.getDetails();
			}
		@PutMapping("/UpdateDetails")
		public Employee UpdateInfo(@RequestBody Employee st1){
			return stuService.UpdateDetails(st1);
			}
		
		@DeleteMapping("/Delete/{id}")
		public String deleteInfo (@PathVariable("id")int id) {
			stuService.deleteDetails(id);
			return "Deleted details";
			}
		}
