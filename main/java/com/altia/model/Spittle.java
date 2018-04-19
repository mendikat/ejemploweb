package com.altia.model;

import java.sql.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Spittle {

	private final Long id;
	private final String message;
	private final Date time;
	private Double latitude;
	private Double longitude;
	
	public Spittle(final String message, final Date time) {
		this( message, time, null, null);		
	}

	public Spittle(final String message,final Date time,final Double latitude,final Double longitude) {
		this.id = null;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(final Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(final Double longitude) {
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}
	
	/**
	 * Obtiene el Hashcode excluyendo los campos de id y time.
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode( this, new String[] { "id", "time"});
	}
	
	/**
	 * Compara objetos excluyendo los campos de id y time.
	 */
	@Override
	public boolean equals(final Object that) {
		return EqualsBuilder.reflectionEquals(this, that, new String[] { "id", "time"});
	}
	
}
