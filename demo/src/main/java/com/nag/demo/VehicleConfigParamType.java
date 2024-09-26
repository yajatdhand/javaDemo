package com.nag.demo;

public enum VehicleConfigParamType {
	OFFERTYPE, RULE, COUNTRY, BRAND, K_WORT, ORIGINAL_COUNTRY, MODEL_YEAR, ESERIES, BASE_MODEL, VEHICLE_GROUPS,
	APPLICATION_NUMBER, HU_NAME, TCU_NAME, ISTEP, CURRENT_ISTEP, ICC_PATTERN, IMEI_PATTERN, FUEL_TYPE, HYBRID,
	DEVICE_INDEX, DEVICE_ADDRESS, DEVICE_TYPE;

	public static VehicleConfigParamType fromString(final String name) {
		return valueOf(name.toUpperCase());
	}
}
