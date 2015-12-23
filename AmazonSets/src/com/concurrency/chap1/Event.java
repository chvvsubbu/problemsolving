package com.concurrency.chap1;

import java.util.Date;

public class Event {

	Date date;
	String event;
	public Date getDate() {
		return date;
	}
	public String getEvent() {
		return event;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setEvent(String event) {
		this.event = event;
	}

}
