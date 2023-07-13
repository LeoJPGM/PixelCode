package com.example.application.views.principal;

import pagina.base.PaginaBase;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import pagina.base.PaginaBase;

@PageTitle("Lenguaje en C")
@Route(value = "lenguaje-c")
public class IntroductionC extends PaginaBase {

    public IntroductionC() {
        PaginaC();
    }

    public void PaginaC(){
        //Contenedores
        VerticalLayout contenedorPrincipal = new VerticalLayout();
        HorizontalLayout contenedorColor = new HorizontalLayout();
        VerticalLayout contenedorTittle = new VerticalLayout();
        VerticalLayout contenedorSecciones = new VerticalLayout();


        //Primer Contenedor (Solo color)
        VerticalLayout contenedor1 = new VerticalLayout();
        contenedor1.getStyle().set("background-color", "#57dbff");
        contenedorColor.add(contenedor1);
        contenedorColor.setWidthFull();

        //Contenedor de titulo
        Span info = new Span("Aprende a programar lenguaje en C");
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        contenedorTittle.add(info);
        contenedorTittle.setAlignItems(FlexComponent.Alignment.CENTER);

        //Contenedor Introduccion
        VerticalLayout contenedorIntroduction = new VerticalLayout();

        Span info2 = new Span("Introduccion al Lenguaje en C");
        info2.getStyle().set("font-size", "24px");
        info2.getStyle().set("color", "black");
        info2.getStyle().set("font-weight", "bold");

        Span info3 = new Span("En esta sección aprenderás los fundamentos necesarios para comprender el Lenguaje en C, la estructura básica de un programa y obtendrás la información necesaria sobre la compilación y ejecución de los programas en C");

        contenedorIntroduction.add(info2, info3);
        contenedorIntroduction.getStyle().set("background-color", "#dae1f0");
        contenedorIntroduction.setWidth("100%");

        //Contenedor Variables
        VerticalLayout contenedorVariables = new VerticalLayout();

        Span info4 = new Span("Variables y tipos de datos en C");
        info4.getStyle().set("font-size", "24px");
        info4.getStyle().set("color", "black");
        info4.getStyle().set("font-weight", "bold");

        Span info5 = new Span("En esta sección aprenderás cómo declarar y utilizar variables en la programación, así como también los tipos de datos, asignación de valores y su uso en cálculos y expresiones.");

        contenedorVariables.add(info4, info5);
        contenedorVariables.getStyle().set("background-color", "#dae1f0");
        contenedorVariables.setWidth("100%");

        //Contenedor Control
        VerticalLayout contenedorControl = new VerticalLayout();

        Span info6 = new Span("Control de flujo en C");
        info6.getStyle().set("font-size", "24px");
        info6.getStyle().set("color", "black");
        info6.getStyle().set("font-weight", "bold");

        Span info7 = new Span("En la sección de control de flujo en C enseña cómo dirigir y controlar la ejecución del programa. Aquí aprenderás a utilizar estructuras de decisión y bucles para tomar decisiones y repetir acciones según las condiciones requeridas. Esto les permite tener un mayor control sobre el flujo del programa y hacer que se ejecute de manera más eficiente y efectiva.");

        contenedorControl.add(info6, info7);
        contenedorControl.getStyle().set("background-color", "#dae1f0");
        contenedorControl.setWidth("100%");

        //Contenedor Final
        VerticalLayout contenedorFinal = new VerticalLayout();

        Span info8 = new Span("Proyecto Final");
        info8.getStyle().set("font-size", "24px");
        info8.getStyle().set("color", "black");
        info8.getStyle().set("font-weight", "bold");

        Span info9 = new Span("En esta sección pondrás en práctica todos los conocimientos que haz adquirido en las secciones anteriores.");

        contenedorFinal.add(info8, info9);
        contenedorFinal.getStyle().set("background-color", "#dae1f0");
        contenedorFinal.setWidth("100%");

        Button empezar1 = new Button("Empezar aquí", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("fundamentos-c");});});

        contenedorSecciones.add(contenedorIntroduction,contenedorVariables,contenedorControl,contenedorFinal);
        contenedorPrincipal.add(contenedorColor,contenedorTittle,contenedorSecciones,empezar1);
        setContent(contenedorPrincipal);
    };

}