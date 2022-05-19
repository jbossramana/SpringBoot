package demo.boot.model;


import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonFormat;

public class City {

    private Long id;
    private String name;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date rsdate;

    public City() {
    }

    public City(Long id, String name, Date rsdate) {
        this.id = id;
        this.name = name;
        this.rsdate = rsdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Date getRsdate() {
		return rsdate;
	}

	public void setRsdate(Date rsdate) {
		this.rsdate = rsdate;
	}

    
}