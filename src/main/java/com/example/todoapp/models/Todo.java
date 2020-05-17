package com.example.todoapp.models;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="stock")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Todo {
    @Id
    private String id;
    
    @NotBlank
    @Size(max=100)
    @Indexed(unique=true)
    private String title;
    private String serial_number;
    private String brand;
    private String model;
    
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String status;

    private Boolean completed = false;

    private Date createdAt = new Date();

    public Todo() {
        super();
    }

    public Todo(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public String getSerial_number() {
 		return serial_number;
 	}

 	public void setSerial_number(String serial_number) {
 		this.serial_number = serial_number;
 	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", serial_number=" + serial_number + ", brand=" + brand
				+ ", model=" + model + ", status=" + status + ", completed=" + completed + ", createdAt=" + createdAt
				+ "]";
	}

	



    
}