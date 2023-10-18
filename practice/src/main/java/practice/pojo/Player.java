package practice.pojo;
import com.fasterxml.jackson.annotation.*;

public class Player{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("country") 
    public String getCountry() { 
		 return this.country; } 
    public void setCountry(String country) { 
		 this.country = country; } 
    String country;
    @JsonProperty("role") 
    public String getRole() { 
		 return this.role; } 
    public void setRole(String role) { 
		 this.role = role; } 
    String role;
    @JsonProperty("price-in-crores") 
    public String getPriceincrores() { 
		 return this.priceincrores; } 
    public void setPriceincrores(String priceincrores) { 
		 this.priceincrores = priceincrores; } 
    String priceincrores;
}