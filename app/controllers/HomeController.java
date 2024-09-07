package controllers;

import java.util.Arrays;
import java.util.List;

import models.NavItem;
import models.Plan;
import models.Coffe;


import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result index() {
        String title = "Hub Café";
        List<NavItem> navItems = Arrays.asList(
            new NavItem("O Hub Café", "ohubcafe"), 
            new NavItem("Espaços", "espacos"),
            new NavItem("Planos", "planos"),
            new NavItem("Cafés", "cafe"),
            new NavItem("Contato", "contato")
        );

        List<Plan> planList = Arrays.asList(
            new Plan("Diário", 12 ),
            new Plan("Semanal", 10 ),
            new Plan("Mensal", 8 )
        );

        List<Coffe> coffeList = Arrays.asList(
            new Coffe("Expresso", 8, "coffe1.jpg"),
            new Coffe("Cappuccino", 10, "coffe2.jpg"),
            new Coffe("Arábico", 12, "coffe3.jpg")
        );


		return ok(views.html.index.render(title, navItems, planList, coffeList));
    }

}
