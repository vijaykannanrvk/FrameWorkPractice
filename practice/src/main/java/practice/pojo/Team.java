package practice.pojo;
import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
	
	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
	// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
	/* ObjectMapper myObject = new ObjectMapper();
	Root root = om.readValue(myJsonString, Root.class); */

	public class Team{
	    @JsonProperty("name") 
	    public String getName() { 
			 return this.name; } 
	    public void setName(String name) { 
			 this.name = name; } 
	    String name;
	    @JsonProperty("location") 
	    public String getLocation() { 
			 return this.location; } 
	    public void setLocation(String location) { 
			 this.location = location; } 
	    String location;
	    @JsonProperty("player") 
	    public ArrayList<Player> getPlayer() { 
			 return this.player; } 
	    public void setPlayer(ArrayList<Player> player) { 
			 this.player = player; } 
	    ArrayList<Player> player;
	}