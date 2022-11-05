package com.example.firstProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class sampleProject {
	// HELLO WORLD
	@GetMapping(value = "/hello")
	public String getHello() {
		return "HELLO WORLD";
	}

	// ADD TWO NUMBERS
	@GetMapping("/addValue/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	// EVEN OR ODD
	@GetMapping("/evenOdd/{a}")
	public String evevOdd(@PathVariable int a) {
		if (a % 2 == 0) {
			return "EVEN NUMBER";
		} else {
			return "ODD NUMBER";
		}
	}

	// MAXIMUM NUMBER
	@GetMapping("/max")
	public int maxNumber() {
		int[] num = { 20, 60, 30, 90, 60 };
		int temp = num[0];
		for (int i = 0; i < num.length; i++) {
			if (temp < num[i]) {
				temp = num[i];
			}
		}
		return temp;

	}

	// PRINT 1 TO 10 NUMBER
	@GetMapping("/print/{num}")
	public List<Integer> printNumber(@PathVariable int num) {
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i <= num; i++) {
			li.add(i);
		}
		return li;

	}

	// CHECK USER AND PASSWORD
	@GetMapping(value = "/check")
	public String checkUser(@RequestParam("name") String name, @RequestParam("Password") String password) {
		if (name.equals("SANTHIYA") && password.equals("san123")) {
			return "Login successfully";
		} else {
			return "Wrong name and password";
		}
	}

	// OBJECT
	@GetMapping(value = "/car")
	public Car getCar(@RequestBody Car c) {
		c.setPrice(c.getPrice() + (c.getPrice() * 5 / 100));
		return c;
	}

	// LIST OBJECT
	@GetMapping(value = "/cars")
	public List<Car> getprice(@RequestBody List<Car> cars) {
		for (Car c : cars) {
			if (c.getPrice() < 10000) {
				c.setPrice(c.getPrice() + (c.getPrice() * 2 / 100));
			} else if (c.getPrice() >= 10000 && c.getPrice() < 200000) {
				c.setPrice(c.getPrice() + (c.getPrice() * 5 / 100));
			} else {
				c.setPrice(c.getPrice() + (c.getPrice() * 7 / 100));
			}

		}
		return cars;
	}

	// FILTER
	@GetMapping(value = "/filter")
	public List<Car> printprice(@RequestBody List<Car> c) {
		List<Car> s = c.stream().filter(x -> x.getPrice() > 1000).collect(Collectors.toList());
		return s;
	}

	// FILTER COUNT
	@GetMapping(value = "/count")
	public long countbrand(@RequestBody List<Car> cars) {
		List<Car> s = cars.stream().filter(x -> x.getBrand().equalsIgnoreCase("audi")).collect(Collectors.toList());
		long bcount = s.stream().count();
		return bcount;
	}

	// MAP
	@GetMapping(value = "/map")
	public List<String> mapcar(@RequestBody List<Car> ca) {
		List<String> d = ca.stream().map(x -> x.getBrand()).collect(Collectors.toList());
		return d;
	}

	// SUMMING INTEGER
	@GetMapping(value = "/sum")
	public Integer sum(@RequestBody List<Car> cp) {
		int s = cp.stream().collect(Collectors.summingInt(b -> b.getPrice()));
		return s;
	}

	// SUMMING DOUBLE
	@GetMapping(value = "/sumd")
	public Double sumd(@RequestBody List<Car> cpd) {
		double s = cpd.stream().collect(Collectors.summingDouble(b -> b.getPrice()));
		return s;
	}

	// SUMMING LONG
	@GetMapping(value = "/suml")
	public long suml(@RequestBody List<Car> cpl) {
		long s = cpl.stream().collect(Collectors.summingLong(b -> b.getPrice()));
		return s;
	}

	@GetMapping(value = "/fib")
	public List<Integer> fib(@PathVariable int num) {
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i <= num; i++) {
			li.add(i);

		}
		return li;

	}

}
