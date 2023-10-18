package practice.test;
import practice.pojo.Player;
import practice.pojo.Team;
import practice.services.TeamService;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTeam extends TeamService{
	@Test
    public void test1() throws IOException
    {
		Team team= GetTeam();
		int foreignPlayerCount=0,wicketKeeper=0;
		for (Player iterable_element : team.getPlayer()) {
			if(!iterable_element.getCountry().equals("India"))
				foreignPlayerCount++;	
			if(iterable_element.getRole().equals("Wicket-keeper"))
				wicketKeeper++;
		}
		Assert.assertEquals(4,foreignPlayerCount);
		Assert.assertEquals(1,wicketKeeper);
    }
}
