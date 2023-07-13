package com.example.application.views.principal;

import com.vaadin.flow.component.button.Button;
import pagina.base.PaginaBase;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.awt.*;


@PageTitle("Lenguaje Java")
@Route(value = "lenguaje-java")
public class IntroductionJava extends PaginaBase {

    public IntroductionJava() {
        PaginaJ();
    }

    public void PaginaJ() {
        //Contenedores
        VerticalLayout contenedorPrincipal = new VerticalLayout();
        HorizontalLayout contenedorColor = new HorizontalLayout();
        VerticalLayout contenedorTittle = new VerticalLayout();
        VerticalLayout contenedorSecciones = new VerticalLayout();

        //Primer Contenedor (Solo color)
        VerticalLayout contenedor1 = new VerticalLayout();
        contenedor1.getStyle().set("background-color", "#e54b4b");
        contenedorColor.add(contenedor1);
        contenedorColor.setWidthFull();

        //Contenedor de titulo
        Span info = new Span("Aprende a programar lenguaje java");
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        contenedorTittle.add(info);
        contenedorTittle.setAlignItems(FlexComponent.Alignment.CENTER);

        //Contenedor Introduccion
        VerticalLayout contenedorIntroduction = new VerticalLayout();

        Span info2 = new Span("Fundamentos de Java");

        info2.getStyle().set("font-size", "24px");
        info2.getStyle().set("color", "black");
        info2.getStyle().set("font-weight", "bold");

        Span info3 = new Span("En esta sección revisaremos: " +
                "Introducción a Java y su entorno de desarrollo.\n" +
                "Aprendizaje sobre variables y tipos de datos.\n" +
                "Utilización de operadores y expresiones para realizar cálculos.");

        contenedorIntroduction.add(info2, info3);
        contenedorIntroduction.getStyle().set("background-color", "#ff9a93");
        contenedorIntroduction.setWidth("100%");

        //Contenedor Polimorfismo
        VerticalLayout contenedorPolimorfismo = new VerticalLayout();

        Span info4 = new Span("Herencia y Polimorfismo");
        info4.getStyle().set("font-size", "24px");
        info4.getStyle().set("color", "black");
        info4.getStyle().set("font-weight", "bold");

        Span info5 = new Span("En esta sección podras: " +
                "Comprender la herencia y cómo se puede utilizar para reutilizar el código.\n" +
                "Creación de clases y subclases para establecer relaciones entre ellas.\n" +
                "Exploración de métodos y atributos heredados para aprovechar la herencia.\n" +
                "Aplicación del polimorfismo para vincular dinámicamente métodos y objetos.");

        contenedorPolimorfismo.add(info4, info5);
        contenedorPolimorfismo.getStyle().set("background-color", "#ffb0aa");
        contenedorPolimorfismo.setWidth("100%");

        //Contenedor Control
        VerticalLayout contenedorControl = new VerticalLayout();

        Span info6 = new Span("Clases Abstractas");
        info6.getStyle().set("font-size", "24px");
        info6.getStyle().set("color", "black");
        info6.getStyle().set("font-weight", "bold");

        Span info7 = new Span("En esta seccion veremos la utilización de clases abstractas para definir comportamientos comunes.");

        contenedorControl.add(info6, info7);
        contenedorControl.getStyle().set("background-color", "#ff9a93");
        contenedorControl.setWidth("100%");

        //Contenedor Final
        VerticalLayout contenedorFinal = new VerticalLayout();

        Span info8 = new Span("Proyecto Final");
        info8.getStyle().set("font-size", "24px");
        info8.getStyle().set("color", "black");
        info8.getStyle().set("font-weight", "bold");

        Span info9 = new Span("En esta sección pondrás en práctica todos los conocimientos que haz adquirido en las secciones anteriores.");

        contenedorFinal.add(info8, info9);
        contenedorFinal.getStyle().set("background-color", "#ffb0aa");
        contenedorFinal.setWidth("100%");

        Button empezar = new Button("Siguiente", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("fundamentos-java");});});

        empezar.getStyle().set("background-color", "transparent");

        contenedorSecciones.add(contenedorIntroduction, contenedorPolimorfismo, contenedorControl, contenedorFinal);
        contenedorPrincipal.add(contenedorColor, contenedorTittle, contenedorSecciones, empezar);
        setContent(contenedorPrincipal);
    }
}