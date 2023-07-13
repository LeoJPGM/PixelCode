package pagina.base;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

public class PaginaBase extends AppLayout {
    public PaginaBase() {
        TituloPrincipal();
    }

    private void TituloPrincipal() {
        H1 pixel = new H1("PIXEL");
        H1 code = new H1("CODE");
        Span espacio = new Span();

        espacio.getStyle().set("flex-grow", "1");
        //Lista de botones para la barra de navegacion
        Button paginaPrincipal = new Button("Pagina principal",  buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("Principal");});});
        Icon pagina_Home = new Icon(VaadinIcon.HOME);

        paginaPrincipal.setIcon(pagina_Home);
        paginaPrincipal.getStyle().set("background-color", "transparent");
        paginaPrincipal.getStyle().set("color", "pink");
        paginaPrincipal.getStyle().set("font-size", "15px");

        Button paginaPasos = new Button("Primeros Pasos",  buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("primeros-pasos");});});
        Icon pagina_Pasos = new Icon(VaadinIcon.EXIT);

        paginaPasos.setIcon(pagina_Pasos);
        paginaPasos.getStyle().set("background-color", "transparent");
        paginaPasos.getStyle().set("color", "pink");
        paginaPasos.getStyle().set("font-size", "15px");

        Button paginaAcerca = new Button("Acerca de");
        Icon pagina_Acerca = new Icon(VaadinIcon.LIGHTBULB);

        paginaAcerca.setIcon(pagina_Acerca);
        paginaAcerca.getStyle().set("background-color", "transparent");
        paginaAcerca.getStyle().set("color", "pink");
        paginaAcerca.getStyle().set("font-size", "15px");

        pixel.getStyle().set("font-family", "Courier");
        pixel.getStyle().set("color", "#d86363");
        code.getStyle().set("font-family", "Courier");
        code.getStyle().set("color", "gray");


        addToNavbar(pixel, code, espacio, paginaPrincipal, paginaPasos, paginaAcerca);
    }
}
