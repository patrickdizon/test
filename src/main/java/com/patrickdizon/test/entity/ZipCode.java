package com.patrickdizon.test.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class ZipCode {

	@Id
	int zipcodeId;
	String zip;
	String state;
	String latitude;
	String longitude;
	String city;
	String full_state;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="PST")
	Date creation_date;
	
	public int getZipcodeId() {
		return zipcodeId;
	}
	public void setZipcodeId(int zipcodeId) {
		this.zipcodeId = zipcodeId;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFull_state() {
		return full_state;
	}
	public void setFull_state(String full_state) {
		this.full_state = full_state;
	}
	public Date getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
	
	public ZipCode() {
		
	}
	
	public ZipCode(int zipcodeId, String zip, String state, String latitude, String longitude, String city,
			String full_state, Date creation_date) {
		this.zipcodeId = zipcodeId;
		this.zip = zip;
		this.state = state;
		this.latitude = latitude;
		this.longitude = longitude;
		this.city = city;
		this.full_state = full_state;
		this.creation_date = creation_date;
	}
	
	@Override
	public String toString() {
		return "ZipCode [zipcodeId=" + zipcodeId + ", zip=" + zip + ", state=" + state + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", city=" + city + ", full_state=" + full_state + ", creation_date="
				+ creation_date + "]";
	}
	
	
	
	
}
