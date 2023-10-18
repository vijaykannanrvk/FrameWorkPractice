package practice.services;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import practice.base.JsonReader;
import practice.pojo.Team;

public class TeamService extends JsonReader{
	
	public Team GetTeam() throws IOException
	{
		String content = readFile("D:\\HomeAssignmentsWorkspace\\src\\main\\resources\\TeamRCB.json");
		ObjectMapper myObject = new ObjectMapper();	
		return myObject.readValue(content, Team.class);
	}

}
