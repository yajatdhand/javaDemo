package com.nag.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		String filterType = "INPUT";
//		List<FilterType> filters = new ArrayList<>();
//		filters = Arrays.stream(filterType.split(",")).map(filter -> FilterType.valueOf(filter))
//				.collect(Collectors.toList());
//		System.out.println(filters);

//		List<String> fieldKeys = List.of(
//				"application_number, base_model, brand, country, current_istep, device_address, device_index, device_type, eseries, fuel_type, hu_name, hybrid, icc_pattern, imei_pattern, istep, k_wort, model_year, offertype, original_country, rule, tcu_name, vehicle_groups");
//		System.out.println("fieldKeys " + fieldKeys);
//		List<VehicleConfigParamType> resultList = fieldKeys.stream().flatMap(str -> Stream.of(str.split(",")))
//				.map(String::trim).map(VehicleConfigParamType::fromString).collect(Collectors.toList());
//
//		System.out.println(resultList);

//		List<List<Integer>> listOfLists = Arrays.asList(
//			    Arrays.asList(1, 2, 3),
//			    Arrays.asList(4, 5, 6),
//			    Arrays.asList(7, 8, 9)
//			);
//
//			List<Integer> flattenedList = listOfLists.stream()
//			    .flatMap(list -> list.stream()) // This line "flattens" the nested lists
//			    .collect(Collectors.toList());
//
//			System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

//		final String[] colNames = "type".split(Pattern.quote("."));
//		System.out.println(Arrays.toString(colNames));

//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(1, "a");
//		map.put(2, "b");
//		map.put(3, "c");
//		map.put(4, "d");
//		map.forEach((column, value) -> {
//			System.out.println(column + " " + value);
//		});
	}
}
