package com.gks.springbatch.csvtopostgres.constants;

public class UploadConstants {
	
	private UploadConstants() {
		throw new IllegalStateException("");
	}
	

	public static final String UPLOAD_URI = "/uploadFile";
	public static final String DEVICE_WHITELIST_TMP_UPLOAD_DIR = "tmpuploads/";
	public static final int CSV_NO_OF_COLUMN = 5;
	public static final int IMSI_RANGE_DIGITS = 8;
	public static final int TACS_DIGITS = 8;
	public static final String[] LINE_TOKENIZER_NAMES = new String[] { "Imsirange", "tacs", "manufacturer", "description", "model" };
	public static final String DEVICE_WHITELIST_INSERT_QUERY = "INSERT INTO device_whitelist (imsirange, tacs, manufacturer, model, description, modifiedtime) VALUES (:imsiRange, :tacs, :manufacturer, :model, :description, :modifiedtime)";


}
