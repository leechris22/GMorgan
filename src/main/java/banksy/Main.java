package banksy;

import java.io.IOException;
import java.sql.SQLException;

import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.*;

public class Main {

	/*
	public static void main(String[] args) throws IOException
	{
		get(new Route("/hello") {
			@Override
			public Object handle(Request request, Response response) {
				return "Hello World";
			}
		});

	}

*/
	public static void main(String[] args) throws IOException, SQLException {
	Maria_DBManager	banksyAccess = new Maria_DBManager();
	banksyAccess.addUser("Gabrie","Morgan","gabrielmorgan1230@gmail.com","123456789","343 east 51st");

	}
}


