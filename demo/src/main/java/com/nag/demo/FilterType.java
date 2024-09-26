package com.nag.demo;

public enum FilterType {
	SIMULATION, INPUT, ADDITIONAL_ATTRIBUTES, MANUAL_CONFIG, EXPORT_VIN_REPORT, DOWNLOADABLE_REPORT,
	DISPLAY_SAMPLE_VIN_REPORT;

	/**
	 * method will check enum is valid ignoring the case
	 * 
	 * @param filterString value to be check
	 * @return category if valid else null.
	 */
	public static FilterType valueOfIgnoreCase(String filterString) {
		for (FilterType filter : FilterType.values()) {
			if (filter.toString().equalsIgnoreCase(filterString)) {
				return filter;
			}
		}
		return null;
	}
}
